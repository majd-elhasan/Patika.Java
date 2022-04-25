import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        float armut = 2.14f, armutQuantity = 0;
        float elma = 3.67f, elmaQuantity = 0;
        float domates = 1.11f, domatesQuantity = 0;
        float muz = 0.95f, muzQuantity = 0;
        float patlican = 5f, patlicanQuantity = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Meyveler ve KG Fiyatları : \n\t* Armut : 2,14 TL\n\t* Elma : 3,67 TL\n\t* Domates : 1,11 TL\n\t* Muz: 0,95 TL\n\t* Patlıcan : 5,00 TL");

        System.out.print("Armut Kaç Kilo ? : ");
        armutQuantity = input.nextFloat();
        System.out.print("Elma Kaç Kilo ? : ");
        elmaQuantity = input.nextFloat();
        System.out.print("Domates Kaç Kilo ? : ");
        domatesQuantity = input.nextFloat();
        System.out.print("Muz Kaç Kilo ? : ");
        muzQuantity = input.nextFloat();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanQuantity = input.nextFloat();
        double sum = armutQuantity*armut + elmaQuantity*elma + domatesQuantity*domates + muzQuantity*muz + patlicanQuantity*patlican;
        System.out.print("Toplam Tutar : ");
        System.out.printf("%.2f", sum); // noktadan sonra iki basamak  %.2f   printf metodu ile

        input.close();
    }
}