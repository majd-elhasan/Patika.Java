import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        // Koç Burcu : 21 Mart - 20 Nisan

        // Boğa Burcu : 21 Nisan - 21 Mayıs

        // İkizler Burcu : 22 Mayıs - 22 Haziran

        // Yengeç Burcu : 23 Haziran - 22 Temmuz

        // Aslan Burcu : 23 Temmuz - 22 Ağustos

        // Başak Burcu : 23 Ağustos - 22 Eylül

        // Terazi Burcu : 23 Eylül - 22 Ekim

        // Akrep Burcu : 23 Ekim - 21 Kasım

        // Yay Burcu : 22 Kasım - 21 Aralık

        // Oğlak Burcu : 22 Aralık - 21 Ocak

        // Kova Burcu : 22 Ocak - 19 Şubat

        // Balık Burcu : 20 Şubat - 20 Mart
        Scanner scan = new Scanner(System.in);
        System.out.print("Doğduğunuz ayın sıralamasını giriniz 1, 2, 3, ... vb  : ");
        int month = scan.nextInt();
        System.out.print("Doğduğunuz günü giriniz 1, 2, 3, ... vb  : ");
        int day = scan.nextInt();

        if(month == 1 && (day >= 1 && day <= 31)){
            if(day <= 21) System.out.println("Burcunuz Oğlak.");
            else System.out.println("Burcunuz Kova.");
        }
        else if(month == 2 && (day>=1 && day <= 29)){
            if(day <= 19) System.out.println("Burcunuz Kova.");
            else System.out.println("Burcunuz Balık.");
        }
        else if(month == 3 && (day>=1 && day <= 31)){
            if(day <=20) System.out.println("Burcunuz Balık.");
            else System.out.println("Burcunuz Koç.");
        }
        else if(month == 4 && (day>=1 && day <= 30)){
            if(day <= 20) System.out.println("Burcunuz Koç.");
            else System.out.println("Burcunuz Boğa.");
        }
        else if(month == 5 && (day>=1 && day <= 31)){
            if(day <= 21) System.out.println("Burcunuz Boğa.");
            else System.out.println("Burcunuz ikizler.");
        }
        else if(month == 6 && (day>=1 && day <= 30)){
            if(day <= 22) System.out.println("Burcunuz ikizler.");
            else System.out.println("Burcunuz Yengeç.");
        }
        else if(month == 7 && (day>=1 && day <= 31)){
            if(day <= 22) System.out.println("Burcunuz Yengeç.");
            else System.out.println("Burcunuz Aslan.");
        }
        else if(month == 8 && (day>=1 && day <= 31)){
            if(day <= 22) System.out.println("Burcunuz Aslan.");
            else System.out.println("Burcunuz Başak.");
        }
        else if(month == 9 && (day>=1 && day <= 30)){
            if(day <= 22) System.out.println("Burcunuz Başak.");
            else System.out.println("Burcunuz Terazi.");
        }
        else if(month == 10 && (day>=1 && day <= 31)){
            if(day <= 22) System.out.println("Burcunuz Terazi.");
            else System.out.println("Burcunuz Akrep.");
        }
        else if(month == 11 && (day>=1 && day <= 30)){
            if(day <= 21) System.out.println("Burcunuz Akrep.");
            else System.out.println("Burcunuz Yay.");
        }
        else if(month == 12 && (day>=1 && day <= 31)){
            if(day <= 21) System.out.println("Burcunuz Yay.");
            else System.out.println("Burcunuz Oğlak.");
        }
        scan.close();
    }
}