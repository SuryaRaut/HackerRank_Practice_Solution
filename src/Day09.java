import java.util.Scanner;

/**
 * Created by surya on 11/26/17.
 */
public class Day09 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Take Input
        System.out.println("Enter the First Number: \n");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number: \n");
        int b = sc.nextInt();
        int gcd = find_gcd(a,b);

        System.out.println("The GCD of "+ a + " and " + b +" is " + gcd);
    }
    static  int find_gcd(int a,int b){
        //Write the base condition
        if(a==b){
            return a;
        }
        int a1 = Math.max(a,b ) - Math.min(a, b);
        int b1 = Math.min(a,b);
        return find_gcd(a1,b1);
    }
}
