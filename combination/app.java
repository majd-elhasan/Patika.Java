import java.util.Scanner;
public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kombinasyon !");
        
        // C(n,r) = n! / (r! * (n-r)!)

        int n = 0;
        int r = 0;
        do {
            System.out.println("n sayı r sayısından büyük olacak şekilde sırasıyla 'n' ve 'r' sayısını giriniz.");
            n = input("n");
            r = input("r");
        } while (n < r);
        
        double nFactorial = factorial(n);
        double rFactorial = factorial(r);
       

        double combination = nFactorial/(rFactorial*factorial(n-r));

        System.out.println("C(n,r) ==> C("+n+","+r+") = "+ combination);
        scanner.close();
    }

    static int input(String num){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print(num +" sayısı : ");
            int limitInput = scanner.nextInt();
            return limitInput;

        } catch (Exception e) {
            System.out.println("Rakam girmelisiniz !");
            input(num);
        }
        scanner.close();
        return 0;
    }
    static double factorial(int num){
        double factorial = 1;
        for(int i = num ; i > 0 ; i--){
            factorial *=i;
        }
        return factorial;
    }
}