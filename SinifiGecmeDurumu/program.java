import java.sql.Ref;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        System.out.println("Sınıf geçme durumu programına hoşgeldiniz  :)");
        Scanner input = new Scanner(System.in);
        int matematk = 0,fizik= 0,kimya=0,arapca=0,turkce=0,felsefe=0;
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
        
        matematk =(matematk<0)? 0:(matematk>100)? 0:matematk;
        fizik =(fizik<0)? 0:(fizik>100)? 0:fizik;
        kimya =(kimya<0)? 0:(kimya>100)? 0:kimya;
        arapca =(arapca<0)? 0:(arapca>100)? 0:arapca;
        turkce =(turkce<0)? 0:(turkce>100)? 0:turkce;
        felsefe =(felsefe<0)? 0:(felsefe>100)? 0:felsefe;

        int toplam = matematk+kimya+felsefe+fizik+arapca+turkce;
        double sayisal_sonuc = toplam/6.0;
        String sozel_sonuc = sayisal_sonuc>=55? "Tebrikler sınıfı Geçtiniz !": "Sınıfta Kaldınız ,seneye tekrar görüşmek üzere ! ";
        System.out.println(sozel_sonuc);
        System.out.println("ortalamanız : " +Math.round(sayisal_sonuc*100)/100d );
        
        input.close();
    }
}
