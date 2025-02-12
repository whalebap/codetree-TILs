import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        // 2쌍씩 k개의 숫자가 내려옴.

        int[] arr = new int[n+1];
        for(int i=0; i<k; i++){
            int first = sc.nextInt();
            int second = sc.nextInt();
            for(int l=1; l<=n; l++){
                if(l>=first && l<=second){
                    arr[l] = arr[l] +1;
                }
            }
        }

        int max = 0;
        for(int j=1; j<=arr.length-1; j++){
           if(max < arr[j]){
                max = arr[j];
           }
        }

        System.out.println(max);

    }
}