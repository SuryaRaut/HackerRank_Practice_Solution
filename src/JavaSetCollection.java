import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by surya on 11/27/17.
 */
public class JavaSetCollection {
    public static void main(String [] args){

        //int [] num = {12,43,23,10,22,30,12,22,60,53};
        String [] names = {"surya", "hari", "roshan","dipesh", "surya", "yeison"};
        //for integer array
        Set<String> set = new HashSet<String>();


        for(int i = 0; i< names.length; i++){
            set.add(names[i]);
        }
        System.out.println("The Unique numbers are :"+ set);

        TreeSet sortedSet = new TreeSet<String>(set);
        System.out.println("Sorted list is :");
        System.out.println(sortedSet);

        System.out.println("The first element of the set is "+ (String) sortedSet.first());
        System.out.println("The last element of the set is " + (String)sortedSet.last());

    }
}
