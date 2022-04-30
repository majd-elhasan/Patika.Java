import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int input= scanner.nextInt();
        if (isPrime(input))
            System.out.println(input+" is a prime number.");
        else
            System.out.println(input+" is not a prime number.");
        scanner.close();
    }
    static int Prime(int num, int twoUp){
        if(num > twoUp)
            if(num % twoUp != 0)
                return Prime(num, twoUp+1);
            else return 0;
        return 1;
    }
    static Boolean isPrime(int num){
        if(Prime(num,2) == 1)
            return true;
        return false;
    }
}
