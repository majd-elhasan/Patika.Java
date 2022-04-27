import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        int age , km ;
        int journeyType ;
        
        double price ,discount = 0, TotalPrice;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden giriniz : ");
        km =  scanner.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = scanner.nextInt();
        System.out.print("Yolculuk tipini giriniz :\n(1)tek yön  \n(2)gidiş dönüş \n ==>  : ");
        scanner.nextLine();
        journeyType = scanner.nextInt();
        price = km * 0.1d;

        if(age > 0 && km > 0 && (journeyType ==(1) || journeyType ==(2))){
            if(age < 12)discount += 0.5d;   //  discount "indirim"  50%
            else if(age < 24)discount += 0.1d;
            else if(age > 65)discount += 0.3d;
            TotalPrice = price - price*discount;
            if(journeyType == 2) TotalPrice -= TotalPrice* 0.2d;
            System.out.println("\nTutar : "+TotalPrice * journeyType +" TL.");
        }
        else System.out.println("Hatalı veri girdiniz !.");

        scanner.close();
    }    
}