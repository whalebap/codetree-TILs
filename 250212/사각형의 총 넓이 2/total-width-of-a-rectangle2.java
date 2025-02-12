import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        // 직사각형 -> 너비로 구하기
        int OFFSET = 100;
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[201][201];

        for(int i=0; i<n; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for(int j= x1; j<x2; j++){
                for(int l = y1; l<y2; l++){
                    arr[j+OFFSET][l+OFFSET] = 1;  
                }
            }
        }

        int cnt = 0;
        for(int i=0; i<201; i++){
            for(int j=0; j<201; j++){
                if(arr[i][j]>0){
                    cnt++;
                }
            }

        }

        System.out.println(cnt);

    }
}