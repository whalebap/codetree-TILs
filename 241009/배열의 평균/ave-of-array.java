import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][4];

        int totalSum = 0;
        for(int i=0; i<2; i++){
            int horizonSum = 0;
            for(int j=0; j<4; j++){
                arr[i][j] = sc.nextInt();
                horizonSum += arr[i][j];
                totalSum += arr[i][j];
            }
            System.out.print(String.format("%.1f", (double)horizonSum / 4) + " ");
        }

        System.out.println("");

        for(int i=0; i<4; i++){
            int verticalSum = 0;
            for(int j=0; j<2; j++){ 
                verticalSum += arr[j][i];
            }
            System.out.print(String.format("%.1f", (double)verticalSum / 2) + " ");
            
        }
        System.out.println("");
        System.out.print(String.format("%.1f", (double)totalSum / 8) + " ");

        // 여기에 코드를 작성해주세요.
    }
}