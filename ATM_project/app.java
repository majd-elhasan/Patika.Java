import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kodluyoruz bankasına hoşgeldiniz !.");
        int tryingRight = 3;
        long balance = 4200;

        String username, password;
        do {
            System.out.print("Kullanıcı adınızı giriniz : ");
            username = scanner.nextLine();
            System.out.print("Şifrenizi giriniz : ");
            password = scanner.nextLine();
            System.out.println();
            if(username.equals("Patika") && password.equals("Dev123"))
            {
                System.out.println("Sisteme başarıyla giriş yaptınız.");
                int selector = 0;
                do {
                    System.out.println("\nyapmak istediğiniz işlemi seçiniz.");
                    System.out.println("1-para çekme\n"+"2-para yatırma\n"+"3-bakiye sorgulama\n"+"4-çıkış");
                    selector = scanner.nextInt();
                    System.out.println();
                    switch (selector) {
                        case 1:
                            System.out.print("çekmek istediğiniz miktarı giriniz : ");
                            int amountW = scanner.nextInt();
                            if(amountW > balance){
                                System.out.println("bakiyeniz yetersiz !.");
                                break;
                            }
                            balance -=amountW;
                            
                            break;
                        case 2:
                            System.out.print("yatımak istediğiniz miktarı giriniz : ");
                            int amountD = scanner.nextInt();
                            balance += amountD;
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : "+ balance);
                            break;
                        default:
                            break;
                    }
                } while (selector != 4);
                
                break;
            }
            else
            {
                tryingRight--;
                if(tryingRight== 0 ){
                    System.out.println("Kullanıcı adınız veya şifreniz hatalıdır\n"+
                    "hesabınız bloke olmuştur, blokeyi kaldırmak için lütfen banka şubemize başvurunuz !.");
                }
                else{
                    System.out.println("Kullanıcı adınız veya şifreniz hatalıdır, lütfen tekrar deneyiniz ! .");
                    System.out.println("Kalan deneme hakkınız : "+ tryingRight);
                }
            }
            
        } while (tryingRight > 0);

        


        scanner.close();
    }
}