import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("seçim yapınız.\n1-EBOB\n2-EKOK");
        int selection = scanner.nextInt();
       
        int a=0 ,b=0;
        
        switch(selection){
            case 1:
                System.out.print("ilk sayı giriniz : ");
                a = scanner.nextInt();
                System.out.print("iiknci sayı giriniz : ");
                b = scanner.nextInt();
                int ebob = 1;
                int smallnum = a < b ? a : b;
                // for(int i= 1 ;i<= smallnum ; i++){
                //     if(a % i == 0 && b % i == 0)
                //         ebob = i;
                // }
                int i = smallnum;
                while(i >= 1){
                    if(a % i == 0 && b % i == 0)
                    {
                        ebob = i;
                        break;
                    }
                    i--;
                }
                System.out.println("EBOB : "+ebob);
            break;
            case 2:
                System.out.print("ilk sayı giriniz : ");
                a = scanner.nextInt();
                System.out.print("iiknci sayı giriniz : ");
                b = scanner.nextInt();
                int bignum = a > b ? a : b;
                int ekok = bignum;
                if(!(a ==0 || b==0))
                {
                    // for(int j = bignum ;j <= a*b ;j++){
                    //     if(j%a ==0 && j%b==0){
                    //         ekok = j;
                    //         break;
                    //     }
                    // }
                    int j = bignum;
                    while(ekok < a*b){
                        if(j%a ==0 && j%b==0){
                            ekok = j;
                            break;
                        }
                        j++;
                    }
                    System.out.println("EKOK : "+ekok);
                }
                else System.out.println("her iki sayı da sıfırdan farklı olmalı. ");
            break; 
            default:
                System.out.println("Hatalı seçim yaptınız !.");
            break;
        }
        scanner.close();
    }
    
}