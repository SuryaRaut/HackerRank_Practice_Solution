/**
 * Created by surya on 12/29/17.
 */
//only works for integer
public class PalindromeCheck {

    public static void main(String [] args){

        int reminder, total = 0, temp;

        int number = 1234321; // the number to be checked

        temp = number;

        while (number>0){

            reminder = number % 10;

            total = (total*10) + reminder;

            number = number / 10;
        }

        if(temp == total){
            System.out.println(temp  + " is a Palindrome");
        }else{
            System.out.println(temp + " is not a Palindrome");
        }
    }

}
