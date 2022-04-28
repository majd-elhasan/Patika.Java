import java.util.Scanner;
public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sınır sayısına kadar olan sayılardan (4)'ün katları olan sayıları toplayalım :) .");
        
        int limitNum = input();
        int sum =0;
        for(int i = 1 ; i <= limitNum ; i++){
            if(i%4==0) sum+=i;
        }
         System.out.println("toplam : "+ sum);

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