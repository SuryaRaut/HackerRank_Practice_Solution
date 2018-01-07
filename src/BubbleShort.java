/**
 * Created by surya on 12/28/17.
 */
public class BubbleShort {


    static void bubbleShort(int[] arr){
        int temp= 0;
        int n = arr.length;

        for(int i = 0; i < n ; i++){
            for(int j = 1; j<(n-i); j ++ ){
                if(arr[j-1] > arr[j]){
                    //swap the value
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public static void main(String [] args){

        int array[] = {3,60,35,2,45,320,5};

        System.out.println("Array before short");
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");


        };
        System.out.println();

        bubbleShort(array );
        System.out.println("Array after sorting");

        for(int i =0; i < array.length; i++ ){
            System.out.print(array[i] + " ");
        }
    }
}
