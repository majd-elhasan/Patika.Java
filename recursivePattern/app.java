import java.util.Scanner;

public class app{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N sayısı : ");
        int n = scanner.nextInt();
        System.out.print("Çıktı : ");
        recursivePattern(n,true,n);
        scanner.close();
    }
    static int recursivePattern(int n,boolean isDown,int copy){
        System.out.print(n+" ");
        
       if(n > 0 && isDown){
        n -=5;
       }
       else{
        isDown = false;
        n +=5 ; 
       }
       if(n == copy+5)
        return 0;
    return recursivePattern(n, isDown, copy);
        
    }
}