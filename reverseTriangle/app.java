import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        System.out.print("bir sayı giriniz : ");
        Scanner Scanner = new Scanner(System.in);
        int n = Scanner.nextInt();
        // for (int i= 0; i<n ; i++){
        //     for(int s = 0; s < i ;s++)
        //         System.out.print(" ");
        //     for(int star = (n-i)*2-1 ;star > 0;star--)
        //         System.out.print("*");
        //     System.out.println("");
        // }
        // System.out.println("==================");
        
        for(int i = n ; i >=1 ; i--){   // To reverse the triangle =>   int i = 0 ; i <= n ; i++
            for(int s = 0;s< n-i ;s++){
                System.out.print(" "); 
            }
            for(int j = 0;j< i+(i-1) ;j++){
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
}
/*
input :10
 output : ↓
 *******************
  *****************
   ***************
    *************
     ***********
      *********
       *******
        *****
         ***
          *
*/