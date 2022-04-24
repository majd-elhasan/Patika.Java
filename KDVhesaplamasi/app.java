import java.util.Scanner;

/**
 * app
 */
public class app {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Para değerini giriniz : ");
        double Money_amount = scanner.nextDouble();

        double KDV = 0.18;
        double KDV_Tutari = 10 *KDV;
        double KDVliFiyat = Money_amount + KDV_Tutari;
        System.out.printf("KDV'siz Fiyat : " + Money_amount +"\n");
        System.out.printf("KDV'li Fiyat : " + KDVliFiyat+"\n");
        System.out.print("KDV tutarı : ");
        System.out.printf("%.1f%n", KDV_Tutari);
    }
}