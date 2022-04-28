import java.util.Scanner;
public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üslü sayı hesaplama !");

        int n = input("üssü alınacak sayıyı giriniz : ");
        int p = input("üs olacak sayıyı giriniz : ");

        long total = 1;
        for(int i =0; i < Math.abs(p) ; i++){
            total *= n;
        }

        if(p < 0){
            System.out.println("üslü sayı : "+1/(double)total);
        }else
            System.out.println("üslü sayı : "+total);
        scanner.close();
    }

    static int input(String message){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print(message);
            int limitInput = scanner.nextInt();
            return limitInput;

        } catch (Exception e) {
            System.out.println("Rakam girmelisiniz !");
            input(message);
        }
        scanner.close();
        return 0;
    }
}