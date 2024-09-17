import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        int[] arr = new int[100];
        for(int i=0; i<arr.length; i++){
            if(a<=1){
                break;
            }
            arr[i] = a % b;
            a = a/b;
            cnt++;
        }

        int[] rest = new int[10];
        for(int j=0; j<cnt; j++){
            rest[arr[j]]++;
        }

        int sum = 0;

        for(int k=0; k<rest.length; k++){
            if(rest[k] != 0){
                sum += rest[k] * rest[k];
            }
        }

        System.out.println(sum);


    }
}