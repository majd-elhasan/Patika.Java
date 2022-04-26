import java.util.Scanner;

public class app {
    // fake uygulama !
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username , password;
        int counter = 0;
        while(counter<3){
        System.out.print("lütfen kullanıcı adınızı giriniz : ");
        username = input.nextLine();
        System.out.print("lütfen şifrenizi giriniz : ");
        password = input.nextLine();
        if (username.equals("Patika") && password.equals("Java101"))
            {
                System.out.println("Giriş yapıldı .");
                break;
            }
        else 
            counter++;
        }
        if(counter ==3){
            
            System.out.println("Hatalı şifre girdiniz , şifreyi sıfırlamak ister misiniz ? (e / h)");
            String answer = input.nextLine();
            switch (answer) {
                case "e":
                    renewPassWord();
                    break;
                case "h":
                    break;
                default:
                    break;
            }
            

        }

        input.close();
    }  
    static void renewPassWord(){
        Scanner input = new Scanner(System.in);
        System.out.println("yeni şifreniz : ");
        if(input.nextLine().equals("Java101")) {System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
        renewPassWord();

        }
        else {System.out.println("Şifre oluşturuldu.");}
        input.close();
        
    }
}