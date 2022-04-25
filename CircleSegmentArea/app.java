import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        // Formül : (𝜋 * (r*r) * 𝛼) / 360

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz : ");
        double r = input.nextDouble();
        System.out.print("Dairenin merkez açısının ölçüsünü giriniz : ");
        double a = input.nextDouble();

        double Area = (Math.PI * r * r * a)/360;
        System.out.println("Daire dilim alanı : " + Area);

        input.close();
    }
}