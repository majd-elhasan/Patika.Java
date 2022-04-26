import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bugünkü sıcaklık derecesini giriniz : ");
        int heat = input.nextInt();

        if(heat < 5 ) System.out.println("kayak yapmaya gidebilirsiniz.");
        else if (heat < 15) System.out.println("Sinemaya gidebilirsiniz");
        if(heat >= 10 && heat < 25) System.out.println("Pikniğe gidebilirsiniz");
        else if (heat >= 25)System.out.println("Yüzmeye gidebilirsiniz");

        input.close();
    }    
}