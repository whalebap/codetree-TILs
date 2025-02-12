import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        
        Scanner sc = new Scanner(System.in);

        int[] x1Arr = new int[100];
        int[] y1Arr = new int[100];
        int[] x2Arr = new int[100];
        int[] y2Arr = new int[100];

        int[][] checked = new int[201][201];

        int OFFSET = 100;
    
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            x1Arr[i] = sc.nextInt();
            y1Arr[i] = sc.nextInt();
            x2Arr[i] = x1Arr[i] + 8;
            y2Arr[i] = y1Arr[i] + 8;

            for(int j=x1Arr[i]+OFFSET; j<x2Arr[i]+OFFSET; j++){
                for(int k=y1Arr[i]+OFFSET; k<y2Arr[i]+OFFSET; k++){
                    checked[j][k]++;   
                }
            }
        }

        int cnt=0;
        for(int i=0; i<201; i++){
            for(int j=0; j<201; j++){
                if(checked[i][j]>0){
                    cnt++;
                }
            }
        }

        System.out.println(cnt);


    }
}