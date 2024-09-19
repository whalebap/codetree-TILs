import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.lang.Integer;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();

        Integer[] arr = new Integer[length];

        int MIN_INT = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr,Collections.reverseOrder());


        System.out.print(String.format("%d %d", arr[0], arr[1]));
    }
}