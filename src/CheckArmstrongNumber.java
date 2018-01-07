/**
 * Created by surya on 12/28/17.
 */
public class CheckArmstrongNumber {

    public static void main(String [] args){

        int n = 153;//to check if it is Armstrong

        int temp;
        int total = 0;
        int i;

        temp = n;

        while(n>0){

            i = n % 10;
            n = n / 10;

            total += ( i * i* i);
        }
        if(temp == total){

            System.out.println( temp + " is a Armstrong Number");
        }else{
            System.out.println( temp + " is not a Armstrong Number");
        }


    }
}
