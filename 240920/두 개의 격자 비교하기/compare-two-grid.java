import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        int[][] resultArr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr2[i][j] = sc.nextInt();
                if(arr1[i][j] != arr2[i][j]){
                    resultArr[i][j] = 1;
                }

                System.out.print(resultArr[i][j] + " ");
            }
            System.out.println("");
        }
        // 여기에 코드를 작성해주세요.
    }
}