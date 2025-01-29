import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static int calculateMinMaxVal(int n, int[] arr){

        // arr를 n개로 쪼갠다.
        // 쪼갠 값을 좌우로 더한다. 
        // 그 값 중 가장 최대를 반환한다. 
        int[] sumArr = new int[n];

        for(int i=0; i<n; i++){
            sumArr[i] = arr[i] + arr[arr.length-1-i];
        }

        int max = 0;

        for(int j=0; j<n; j++){
            if(sumArr[j] > max){
                max = sumArr[j];
            }
        }

        return max;

    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[2*n];

        for(int i=0; i<2*n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(calculateMinMaxVal(n, arr));
    }
}