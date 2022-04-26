import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("gireceğiniiz sayılar küçükten büyüğe doğru sıralanacaktır.\n");
        System.out.print("a. sayıyı giriniz : ");
        long a = input.nextLong();
        System.out.print("b. sayıyı giriniz : ");
        long b = input.nextLong();
        System.out.print("c. sayıyı giriniz : ");
        long c = input.nextLong();
        System.out.print("d. sayıyı giriniz : ");
        long d = input.nextLong();
        System.out.print("e. sayıyı giriniz : ");
        long e = input.nextLong();
        System.out.print("f. sayıyı giriniz : ");
        long f = input.nextLong();

        long[] input_nums = {a,b,c,d,e,f};
        for (int i = 0 ; i <input_nums.length ;i++){
            for (int j = 0 ; j <input_nums.length ;j++){
                if(input_nums[i] > input_nums[j] && i<j){
                    Long k = input_nums[j];
                    input_nums[j] = input_nums[i];
                    input_nums[i] = k; 
                }
            }
        }
        for (long i : input_nums) {
            System.out.print(i + " ");
        }
        input.close();
    }
    
}