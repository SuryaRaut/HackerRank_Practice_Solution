import javax.swing.*;

/**
 * Created by surya on 11/25/17.
 */
public class ArrayManipulation {

    public static String output = "";

    public static void main(String [] args){

        final  int size = 5;
        int [] array = new int [size];

        read_array_element(array, size);
        print_array_element(array, size);

        JOptionPane.showMessageDialog(null, output);
    }

    private static void print_array_element(int[] a, final int row) {
        output = "\nThe array Elements are ";
        for(int i = 0; i<a.length; i++){
            output+= " " + a[i];


        }
    }


    private static void read_array_element(int[] a, final  int row) {
        for(int i = 0; i<a.length; i++){
            a[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter " + row + " Numbers"));
        }
    }

}
