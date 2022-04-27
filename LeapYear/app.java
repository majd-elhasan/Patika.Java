import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Yılnın artık olup olmadığını hesaplayan makine ***");
        System.out.print("Yıl giriniz : ");
        int year = scanner.nextInt();
        boolean isLeap = false;
        
        if((year/100)%4 !=0 ) isLeap = false;
        else if(year%4==0) isLeap = true;

        if(isLeap)System.out.println(year+" bir artık yıldır !");
        else System.out.println(year +" bir artık yıl değildir !");

        scanner.close();
    }
}