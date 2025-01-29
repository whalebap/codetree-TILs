import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();

        String[] arr = new String[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }

        Arrays.sort(arr);
        String[] arr2 = Arrays.stream(arr).filter(e->e.startsWith(str)).toArray(String[]::new);

        System.out.println(arr2[k-1]);

        
    }
}