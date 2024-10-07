import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        int min = 0;
        int max = 0;
        int minCnt = 0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(i==0){
                min = arr[i];
            } else {
                if(arr[i] < min)
                min = arr[i];
                minCnt = i;
            }
        }

        for(int j=minCnt; j<n; j++){
            if(arr[j] > max){
                max = arr[j];
            }
        }

        System.out.println(max-min > 0 ? max-min : 0);
    }
}