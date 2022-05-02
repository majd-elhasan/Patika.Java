class App{
    public static void main(String[] args) {
        int[] arr = {0,5,4,8,11,16,2};
        printNearest_Big_Small(arr,0);
        
    }
    static int nearestBig(int[] array, int value){
        int nearest = Integer.MAX_VALUE;
        for (int i : array) {
            if(  value < i && i < nearest ){
                nearest = i;
            }
        }
        return nearest;
    }
    static int nearestSmall(int[] array, int value){
        int nearest = Integer.MIN_VALUE;
        for (int i : array) {
            if( nearest < i && i < value){
                nearest = i;
            }
        }
        return nearest;
    }
    static String toString(int[] array){
        String arr_s = "{";
        for(int i = 0 ; i < array.length ; i++){
            if(i != array.length-1)
                arr_s += array[i]+",";
            else arr_s += array[i];
        }
        return arr_s+"}";
    }
    static void printNearest_Big_Small(int[] arr,int value){
        System.out.println("Dizi                                : " + toString(arr));
        System.out.println("Girilen sayı                        : " + value);
        System.out.println("Girilen sayıdan en yakın küçük sayı : " + nearestSmall(arr,value));
        System.out.println("Girilen sayıdan en yakın büyük sayı : " + nearestBig(arr,value));

    }
}