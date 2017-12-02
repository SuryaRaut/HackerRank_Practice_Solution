import java.util.Scanner;

/**
 * Created by surya on 11/27/17.
 */
public class GCDPractice {
    public static void main(String [] args){
        Scanner  sc = new Scanner(System.in);
        System.out.println("First Number \n");
        int a = sc.nextInt();
        System.out.println("Second Number \n");
        int b = sc.nextInt();

        System.out.println("The GCD of "+ a + " and " + b + " is " + findGCD(a,b) );
    }

    private static int  findGCD(int a, int b) {
        if(b == 0){
            return a;
        }
        else{return findGCD(b, a % b);}
    }
}
