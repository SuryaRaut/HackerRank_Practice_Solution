/**
 * Created by surya on 12/29/17.
 */
public class LinearSearch {

    public static void main(String [] args){
        int [] array = {10,20,30,50,70,90};

        int target = 15;

        System.out.println(target +" is found at index " + linearSearch(array, target));
    }

    private static int linearSearch(int[] array, int target) {

        for(int i =0; i< array.length; i++){
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }
}
