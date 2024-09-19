import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int minus = 100;
        
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(i==0){
                continue;
            }
            if(arr[i] - arr[i-1] < minus){
                minus = arr[i] -arr[i-1];
            }
        }

        System.out.println(minus);
        // 여기에 코드를 작성해주세요.
    }
}