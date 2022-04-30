import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        System.out.println("Kaç tane sayı gireceksiniz ? ");
        Scanner Scanner = new Scanner(System.in);
        int n = Scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= n; i++){
            System.out.print(""+i+". sayıyı giriniz : ");
            int input = Scanner.nextInt();
            if(input < min)
                min = input;
            else if (input > max)
                max = input;
        }
        System.out.println("MinValue : "+ min+"\nMaxValue : "+max);
    }
}