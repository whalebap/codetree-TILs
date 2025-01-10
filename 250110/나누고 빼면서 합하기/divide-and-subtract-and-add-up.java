import java.util.Scanner;

public class Main {

    public static int n, m;
    public static int[] arr = new int[n+1];

    public static void printCalculate(int[] arr){

        int cnt = 0;
        while(m > 0){
            cnt += arr[m];
            
            if(m % 2 == 0){
                m /= 2;
            } else {
                m --;
            }

  
            
            
        }

        System.out.println(cnt);
    }


    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        int[] arr = new int[n+1];

        for(int i=0; i<n; i++){
            arr[i+1] = sc.nextInt();
        }

        printCalculate(arr);
    }
}