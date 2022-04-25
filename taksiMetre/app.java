import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        float kmFare = 2.2f ;// in turkish lira
        float minimumFare = 20 ; 
        float startAmount = 10;

        float kilometrage;
        float TotalFare ;

        Scanner input = new Scanner(System.in);
        System.out.print("taksinin gittiği kilometrajı giriniz : ");
        kilometrage = input.nextFloat();
        TotalFare = startAmount + kilometrage*kmFare ;
        TotalFare = (TotalFare < minimumFare)? minimumFare: TotalFare;

        System.out.println("Ücret : " + TotalFare);

        input.close();
    }
}