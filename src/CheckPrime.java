/**
 * Created by surya on 12/6/17.
 */
public class CheckPrime {
    public static void main(String [] args){

        int num=9, d;
        d = 2;
        boolean flag = true;

        while(d<= num/2){
            if(num%d==0){
                flag = false;
                break;
            }
            d++;
        }
        if(flag==true){
            System.out.println(num + " is a Prime numner");
        }else{
            System.out.println(num + " is not a prime number");
        }

    }
}
