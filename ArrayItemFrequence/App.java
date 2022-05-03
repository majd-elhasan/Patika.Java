import java.util.Scanner;

class App{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("dizinin eleman sayısını giriniz : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("dizinin elemanlarını boşluk aralıklı giriniz.");
        for (int i = 0 ; i< arr.length ; i++) {
            arr[i] = scan.nextInt();
        }
        duplicatedNums(arr);

    }
    static void duplicatedNums(int[] arr){
        System.out.print("dizi : [");
        for(int i = 0 ; i < arr.length; i++){
            if(i == arr.length -1)
                System.out.print(arr[i]);
            else 
                System.out.print(arr[i]+",");
        }
        System.out.println("]\nTekrar sayıları");
        int[] duplicatedArr = new int[0];
        for(int i = 0 ; i < arr.length ; i++)
            if(isNotDuplicated(duplicatedArr, arr[i])){
            System.out.print(arr[i] + " sayısı " +  howMuchDuplicated(arr, arr[i]) +" kere tekrar edildi.");
            System.out.println(); 
            duplicatedArr =  new int[duplicatedArr.length+1];
            duplicatedArr[duplicatedArr.length-1] = arr[i];
        }
    }
    static int howMuchDuplicated(int[] arr,int x){
        int times = 0;
        for(int i = 0 ; i < arr.length ; i++)
                if(x == arr[i])
                {
                    times++;
                }
    return times;
    }
    static Boolean isNotDuplicated(int[] arr, int num){
        int counter = 0;
        for (int i : arr)
            if(num == i)
               counter ++;
        if(counter > 0)
            return false;
        
        return true;
    }
}