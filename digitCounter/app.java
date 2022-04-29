import java.util.ArrayList;
import java.util.Scanner;

public class app {
public static void main(String[] args) {

    int intNum = input();
    int sum = 0;
    for (int digit :  sliceNumber(intNum)) {
        sum += digit;
    }
    System.out.println("Toplam : "+sum);
   
   
}
static ArrayList<Integer> sliceNumber(int number){
    ArrayList<Integer> numDigits = new ArrayList<Integer>();
    while(number >=0){
        int remainder = number%10;
        number /=10;
        numDigits.add(remainder);
        if (number == 0) break;
    }

    return numDigits;
}
static int input(){
    Scanner scanner = new Scanner(System.in);
    try {
        System.out.print("bir sayı giriniz : ");
        int num = scanner.nextInt();
        return num;

    } catch (Exception e) {
        System.out.println("Rakam girmelisiniz !");
        input();
    }
    scanner.close();
    return 0;
}
}