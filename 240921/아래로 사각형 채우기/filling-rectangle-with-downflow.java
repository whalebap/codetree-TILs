import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++){
            int num = i+1;
            for(int j=0; j<n; j++){
                
                arr[i][j] = num;
                num += 5;
                System.out.print(arr[i][j] +" ");  
            }
            System.out.println("");
        }
    }
}