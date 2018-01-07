/**
 * Created by surya on 12/28/17.
 */
public class SelectionSort {


    public static void main(String [] args){

        int [] array = {9,14,3,2,43,11,58,22};

        System.out.println(" Array Before the sort");

        for(int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");

        }
        System.out.println();

        selectionSort(array);

        System.out.println("Array after the sort ");
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }

    }

    public static void selectionSort(int [] array1){


        for(int i = 0; i< array1.length - 1; i++ ){
            int index = i;
            for(int j = i + 1; j < array1.length; j ++ ){
                if(array1[j] < array1[index]){
                    index = j;

                }
            }
            int small = array1[index];
            array1[index] = array1[i];
            array1[i] = small;
        }
    }
}
