
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();

             if(i%2 == 0){
                Arrays.sort(arr, 0, i+1);
                System.out.print(arr[i/2] + " ");
            }
        }
    }
}