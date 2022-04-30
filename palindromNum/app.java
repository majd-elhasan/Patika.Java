import java.util.Scanner;

public class app{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("palindrom sayıyı bilen programa Hoşgeldiniz ! :) \nŞansınız deneyiniz : ");
        int input = scanner.nextInt();
        if(ispalindrom(input))
            System.out.println(input + " bir palindrom sayıdır.");
        else
            System.out.println(input + " bir palindrom sayı değildir.");

        scanner.close();
    }
    static Boolean ispalindrom(int num){
        int givenNum = num , lastDigit , reversedNum = 0;
        while(givenNum!=0){
            lastDigit = givenNum %10;
            reversedNum = reversedNum*10 +lastDigit;
            givenNum /= 10;
        }
        if(num == reversedNum)
            return true;
        return false;
    }
}