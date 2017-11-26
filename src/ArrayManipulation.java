/**
 * Created by surya on 11/25/17.
 */
public class ArrayManipulation {

    public static String output = "";

    public static void main(String [] args){
        final int size = 5;
        int [] array = new int [size];

        read_array_element(array, size);
        print_array_element(array, size);
    }

    private static void print_array_element(int[] a, int row) {
    }

    private static void read_array_element(int[] a, int row) {
        for(int i = 0; i<a.length; i++){
            output += "The array elements are "+ row;
        }
    }
}
