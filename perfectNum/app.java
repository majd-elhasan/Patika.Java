import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        System.out.print("bir sayı giriniz : ");
        Scanner Scanner = new Scanner(System.in);
        int n = Scanner.nextInt();
        int sum = 0;
        for(int i = 1; i<n; i++){
            if(n%i == 0)
                sum += i;
        }
        if(sum == n)
            System.out.println(n +" mükemmel sayıdır.");
        else System.out.println(n +" mükemmel sayı değildir.");
    }
}