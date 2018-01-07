import java.util.HashMap;

/**
 * Created by surya on 12/22/17.
 */
public class Anagram {

    public static void main(String [] args){
        String s1 = "SAVE";
        String s2 = "VASE";
        isAcronym(s1, s2);

    }
    public static boolean isAcronym (String s1, String s2){
        if(s1.length() != s2.length()){
            return false;

        }
        HashMap<Character, Integer > count = new HashMap<>();
        //calculate the character and count

        for(int i = 0 ; i< s1.length(); i++){
            if(count.containsKey(s1.charAt(i))){
                count.put(s1.charAt(i), count.get(s1.charAt(i)+ 1));
            }else{
                count.put(s1.charAt(i), 1);
            }
        }
        //compare with string s2
        for(int i = 0; i<s2.length(); i++){
            if(count.containsKey(s2.charAt(i))){
                count.put(s2.charAt(i), count.get(s2.charAt(i) - 1));
            }else{
                return false;
            }
        }
        //check all letter match
        for(int c : count.values()){
            if(c != 0){
                return false;

            }
        }
        return true;
    }
}
