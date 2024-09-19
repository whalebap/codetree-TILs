import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        // 여기에 코드를 작성해주세요.

        int MAX = 0;
        int MIN = 1001;

        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();

            if(arr[i] <500){
                if(arr[i]>MAX){
                    MAX = arr[i];
                }
                
            } else  {
                if(arr[i]<MIN){
                    MIN = arr[i];
                }
            }
        }

        System.out.println(MAX + " "+ MIN);
    }
}