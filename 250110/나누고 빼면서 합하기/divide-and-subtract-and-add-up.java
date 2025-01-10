import java.util.Scanner;

public class Main {

    public static int n, m;

    public static void printCalculate(int[] arr){

        int cnt = m;
        while(m > 1){
            if(m % 2 == 0){
                m /= 2;
            } else {
                m -= 1;
            }

            cnt += arr[m];
            
        }

        System.out.println(cnt);
    }


    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        printCalculate(arr);
    }
}