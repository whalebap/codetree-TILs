import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int idx = -1;
        int cnt = 0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i]==2){
                cnt++;
            }

            if(cnt >2){
                System.out.println(i+1);
                break;
            }
        }
    }
}