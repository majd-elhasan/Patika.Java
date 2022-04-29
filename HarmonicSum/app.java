import java.util.Scanner;

public class app {
public static void main(String[] args) {
    int limit = input();
    double harmonicSum = 0;
    for(double i = 1; i <= limit ; i++){
        harmonicSum += 1/i;
    }

    System.out.println("Harmonik seri toplamı : "+ harmonicSum);
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