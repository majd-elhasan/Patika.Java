import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        // Kilo (kg) / Boy(m) * Boy(m)

        //Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
        // Lütfen kilonuzu giriniz : 105
        // Vücut Kitle İndeksiniz : 35.49215792320173

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double height = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo = input.nextDouble();
        System.out.print("Vücut Kitle İndeksiniz : ");
        double bmi = kilo / (height*height);
        System.out.print(bmi);
        input.close();
    }
    
}