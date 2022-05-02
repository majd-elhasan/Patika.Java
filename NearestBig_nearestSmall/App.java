class App{
    public static void main(String[] args) {
        int[] arr = {0,5,4,8,11,16,2};
        System.out.println(nearestSmall(arr,0));
        
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
}