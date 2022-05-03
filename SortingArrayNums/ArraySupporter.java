public class ArraySupporter {
    static int[] sort(int[] array){
        for (int i = 1 ; i < array.length ; i++) {
            for(int j = 0 ; j< i ; j++){
                if(array[j] > array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;

    }
}
