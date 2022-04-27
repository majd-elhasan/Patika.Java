import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** çin zodyağı burcu hesaplama uygulaması ***");
        System.out.print("\nDoğum yılınız : ");
        int year = scanner.nextInt();

        int ZodiacNum = year%12;
        String[] ZodiacNames = {"Maymun", "Horoz", "Köpek", "Domuz","Fare", "Öküz", "Kaplan", "Tavşan","Ejderha", "Yılan", "At", "Koyun"};
        System.out.println("Çin zodyağı burcunuz : " + ZodiacNames[ZodiacNum]);

        scanner.close();
    }    
}