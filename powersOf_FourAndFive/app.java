import java.util.Scanner;
public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Girilen sayıya kadar olan (4) ve (5)'in küvvetlerini yazdıralım :) .");
        
        int limitNum = input();
        System.out.println("4'ün küvvetleri     5'in küvvetleri");
        for(int i = 1 ,j = 1; i <= limitNum ; i*=4,j*=5){
            System.out.print(i);
            if(j <= limitNum)
                System.out.println("\t\t    "+j);
        }
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