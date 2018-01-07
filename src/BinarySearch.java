/**
 * Created by surya on 12/29/17.
 */
public class BinarySearch {

    public static void main(String [] args){

        BinarySearch br = new BinarySearch();

        int array [] = {10,20,30,40,50};
        //int target = 20;


        System.out.println( " The position of the value is "+ br.binarySearch(array, 20));






    }
    public static int binarySearch(int [] array,  int target){
        int low = 0;
       int  high = array.length - 1;
        //int mid = (low + high)/2;

        for(int i = 0; i< array.length; i++){

            while(low <= high){
                int mid = (low + high)/2;

                if(target == array[mid]){
                    return mid;


                }
                else if(target < array[mid]){
                    low = 0;
                    high = mid -1;
                }else {
                    low = mid + 1;
                    high = array.length -1;
                }

            }
        }
        return -1;
    }
}
