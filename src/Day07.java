import java.util.Scanner;

/**
 * Created by surya on 12/2/17.
 */
public class Day07 {
    //ArrayReverse
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();

        }
        String str = "";
        for (int i = N - 1; i >= 0; i--) {
            str += arr[i];


        }
        System.out.println(str);


    }
}