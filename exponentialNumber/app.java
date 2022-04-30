import java.util.Scanner;

public class app{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("üslü sayı hesabı");
        System.out.println("================");
        while(true){
            System.out.print("Taban değeri giriniz : ");
            int base = scanner.nextInt();
            System.out.print("Üs değerini giriniz : ");
            int expo = scanner.nextInt();
            if(base ==0)
                break;
            System.out.println("Sonuç : "+expoF(base, expo)); 
            System.out.println("- - - - - - - - - - - - ");
        }
    }
    static int expoF(int base,int expo){
        if(expo == 0 )
            return 1;
        return base* expoF(base, expo-1);
    }
}