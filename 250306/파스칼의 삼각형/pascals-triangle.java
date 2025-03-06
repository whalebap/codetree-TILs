import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++){
            
            for(int j=0; j<=i; j++){
                if(j==0 || j==n-1){
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
            
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}