import java.util.ArrayList;
import java.util.Scanner;

public class app {
public static void main(String[] args) {

    int intNum = input();
    if(isArmstrong(intNum))
        System.out.println(intNum + " : bir armstrong sayıdır ");
    else System.out.println(intNum + " : bir armstrong sayı değildir ! " );


}
static boolean isArmstrong(int number){
    ArrayList<Integer> numArr = sliceNumber(number);
    int length = numArr.size();
    int num  = 0;
    for (int digit : numArr) {
        int subSum = 1 ;
        for(int i = 0 ; i<length ; i++){
            subSum *= digit;
        }
        num += subSum;
    }
    if(num != number)
        return false;
    return true;
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