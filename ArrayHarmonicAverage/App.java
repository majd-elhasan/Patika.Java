class App{
    public static void main(String[] args) {
        int[] arr = {2,2,4,4,2};
        System.out.println("dizideki elemanların harmonik ortalaması :  "+harnonicAverage(arr));
    }
    static double harnonicAverage(int[] array){
        double sum=0;
        for(int i = 0 ; i < array.length;i++){
            sum += 1d/array[i];
        }
        return (array.length/sum);
    }
}