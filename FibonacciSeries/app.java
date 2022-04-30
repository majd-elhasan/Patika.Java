import java.util.Scanner;

public class app{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını giriniz : ");
        int n = scanner.nextInt();
        System.out.print("0 1 ");
        int pre_previousNum = 0;
        int previousNum = 1; 
        for(int i = 1 ; i < n ; i++){
            int current = pre_previousNum + previousNum;
            System.out.print(current+" ");
            pre_previousNum = previousNum;
            previousNum = current;

        }

        scanner.close();
    }
}