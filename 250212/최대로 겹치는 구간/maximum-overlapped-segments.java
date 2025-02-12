import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        // 구간 x1, x2-1
        // 몇 개의 선분이 겹치나

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[200];

        for(int i=0; i<n; i++){

            int first = sc.nextInt();
            int second = sc.nextInt();

            for(int j=0; j<200; j++){
                if(j>=first && j<=second-1){
                    arr[j]++;
                }
            }
        }

        int max = 0;
        for(int i=0; i<200; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }

        System.out.println(max);
    }

}