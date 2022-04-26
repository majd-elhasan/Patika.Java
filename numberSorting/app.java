import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("gireceğiniiz sayılar küçükten büyüğe doğru sıralanacaktır.\n");
        System.out.print("a. sayıyı giriniz : ");
        int a = input.nextInt();
        System.out.print("b. sayıyı giriniz : ");
        int b = input.nextInt();
        System.out.print("c. sayıyı giriniz : ");
        int c = input.nextInt();
        System.out.print("d. sayıyı giriniz : ");
        int d = input.nextInt();
        System.out.print("e. sayıyı giriniz : ");
        int e = input.nextInt();
        System.out.print("f. sayıyı giriniz : ");
        int f = input.nextInt();

        int[] input_nums = {a,b,c,d,e,f};
        for (int i = 0 ; i <input_nums.length ;i++){
            for (int j = 0 ; j <input_nums.length ;j++){
                if(input_nums[i] > input_nums[j] && i<j){
                    int k = input_nums[j];
                    input_nums[j] = input_nums[i];
                    input_nums[i] = k; 
                }
            }
        }
        for (int i : input_nums) {
            System.out.print(i + " ");
        }
        input.close();
    }
    
}