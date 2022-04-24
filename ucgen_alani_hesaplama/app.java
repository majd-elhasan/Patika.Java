import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("alanını hesaplamak istediğiniz üçgenin kanarlarını boşluk aralıklı giriniz ");
        String girdi = input.nextLine();
        String[] girdiler = girdi.split(" ");
        input.close();
        double a,b,c;
        a = Double.parseDouble( girdiler[0]);
        b = Double.parseDouble( girdiler[1]);
        c = Double.parseDouble( girdiler[2]);

        double u = (a+b+c) / 2;
        double alan = Math.sqrt(u * (u - a)* (u - b) * (u - c));

        System.out.println(alan);

    }
}
