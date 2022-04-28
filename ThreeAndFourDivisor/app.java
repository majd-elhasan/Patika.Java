import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sınır sayısına kadar olan sayıların (3 ve 4)'e tam bölenlerin ortalamasını hesaplayalım :) .");
        
        int limitNum = input();
        int sum =0;
        double average;
        double counter = 0;
        for(int i = 1 ; i <= limitNum ; i++){
            if(i% 3==0 && i%4==0){counter++; sum+=i;}
        }
        average = Double.isNaN(sum/counter)? 0:sum/counter;
        // System.out.println("toplam : "+ sum);
        System.out.println("Ortalama : "+ average);
        // System.out.println("sayaç : "+ counter);
        scanner.close();
    }
    static int input(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("sınır sayısını giriniz : ");
            int limitInput = scanner.nextInt();
            return limitInput;

        } catch (Exception e) {
            System.out.println("Rakam girmelisiniz !");
            input();
        }
        scanner.close();
        return 0;
    }
}