import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];

int cnt = 0;
        for(int i=0; i<4; i++){
            
            for(int j=0; j<4; j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j] % 5 ==0){
                    cnt ++;
                }
            }
            

        }
        System.out.println(cnt);
    }
}