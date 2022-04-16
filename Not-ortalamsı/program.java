import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        System.out.println("Not ortalaması programına hoşgeldiniz  :)");
        Scanner input = new Scanner(System.in);
        int matematk,fizik,kimya,arapca,turkce,felsefe;

        System.out.print("Matematik notunuzu giriniz : ");
        matematk = input.nextInt();
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        System.out.print("Arapça notunuzu giriniz : ");
        arapca = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();
        System.out.print("felsefe notunuzu giriniz : ");
        felsefe = input.nextInt();

        int toplam = matematk+kimya+felsefe+fizik+arapca+turkce;
        double sayisal_sonuc = toplam/6.0;
        String sozel_sonuc = sayisal_sonuc>=60? "Sınıfı Geçti": "Sınıfta Kaldı";
        System.out.println(sozel_sonuc);
        
        input.close();
    }
    
}
