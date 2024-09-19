import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();

        int[] arr = new int[length];

        int MIN_INT = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int MIN_INT2 = Integer.MIN_VALUE;
        for(int j=0; j<arr.length; j++){
            if(arr[j] > MIN_INT){
                MIN_INT = arr[j];
            }
             if(arr[j] >= MIN_INT2 && arr[j] <= MIN_INT){
                MIN_INT2 = arr[j];
            }
        }

        System.out.print(String.format("%d %d", MIN_INT, MIN_INT2));
    }
}