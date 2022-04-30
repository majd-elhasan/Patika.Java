import java.util.ArrayList;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> primeNums = new ArrayList<Integer>(){{
            add(2);
        }};
        for(int i = 2 ; i< 100 ; i++){
            for(int p = 0 ; p < primeNums.size();p++)
                if(i% primeNums.get(p) ==0)
                    break;
                else if(p == primeNums.size()-1)
                    primeNums.add(i);
        }
        System.out.println(primeNums);

        scanner.close();
    }
}