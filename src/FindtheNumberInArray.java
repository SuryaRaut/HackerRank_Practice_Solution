import java.util.Scanner;

/**
 * Created by surya on 12/9/17.
 */
public class FindtheNumberInArray {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter size:");
        int N = sc.nextInt();

        System.out.println("please enter :" + N + " numbers:\n");

        int [] array = new int[N];
        for(int i = 0; i < N; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the desire number:\n");
        int k = sc.nextInt();




        System.out.println(findNumber(array, k));
       //int [] array = sc.nextInt();
    }
    static String findNumber(int[] arr, int k) {
        for(int i = 0; i< arr.length; i ++){

            if( arr[i] == k){
                System.out.println("yes");
            }
             else{System.out.println("no");}


//            if(arr[i] == k){
//                System.out.println("YES");
//            }
//            else{
//                System.out.println("NO");
//
//            }
        }
        return findNumber(arr,k);
    }
}
