import java.util.Scanner;


public class Main {

    public static int[] arr = new int[100];

    public static void printSum(int a1, int a2){
        
        int sum = 0;

        for(int i=a1; i<=a2; i++){
            sum += arr[i-1];
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();


        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

    
        for (int j=0; j<m; j++){

            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            printSum(a1, a2);
        }

        
    }
}