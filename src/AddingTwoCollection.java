import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by surya on 12/24/17.
 */
public class AddingTwoCollection {

    public static void main(String [] args){
        String array1 [] = { "Hari", "Shyam", "Yeison", "Cross"};
        String array2 [] = { "Surya", "Jimmy", "Cross", "Yeison"};


        Set<String> newset = new HashSet<String>();
        newset.addAll(Arrays.asList(array1));
        newset.addAll(Arrays.asList(array2));

        String array3[] = newset.toArray(new String[newset.size()]);

        System.out.println("Array1 :" + Arrays.toString(array1));
        System.out.println("Array2 :" + Arrays.toString(array2));

        System.out.println("Array3 :" + Arrays.toString(array3));


    }

}
