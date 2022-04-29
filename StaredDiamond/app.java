import java.util.Scanner;

public class app {
public static void main(String[] args) {
    int size = input();
    for(int i = 1 ; i <= size ; i++){
        for(int s = 0;s< size-i ;s++){
            System.out.print(" "); 
        }
        for(int j = 0;j< i+(i-1) ;j++){
            System.out.print("*"); 
        }
        System.out.println();
    }
    for(int i = size-1 ; i >= 1 ; i--){
        for(int s = 0;s< size-i ;s++){
            System.out.print(" "); 
        }
        for(int j = 0;j< i+(i-1) ;j++){
            System.out.print("*"); 
        }
        System.out.println();
    }
}
static int input(){
    Scanner scanner = new Scanner(System.in);
    try {
        System.out.print("bir sayı giriniz : ");
        int num = scanner.nextInt();
        return num;

    } catch (Exception e) {
        System.out.println("Rakam girmelisiniz !");
        input();
    }
    scanner.close();
    return 0;
}
}