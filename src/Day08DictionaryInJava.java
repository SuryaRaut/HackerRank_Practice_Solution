import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by surya on 11/25/17.
 */
public class Day08DictionaryInJava {

    public static void main(String []argh){
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();


            phoneBook.put(name, phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();

            if(phoneBook.containsKey(s)){
                System.out.println(s +"="+ phoneBook.get(s));

            }else{
                System.out.println("Not found");
            }




            // Write code here
        }
        in.close();
    }

}
