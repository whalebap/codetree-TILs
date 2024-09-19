import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();

        int[] arr = new int[length];

        int idx = -1;
        int INT_MIN = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int j=0; j<arr.length; j++){
            boolean exsistSame = false;

            for(int k=0; k<arr.length; k++){
                if(arr[k]==arr[j] && k!=j){
                    exsistSame = true;
                    break;
                }
            }

            if(exsistSame){
                continue;
            }

            if(arr[j]>INT_MIN){
                INT_MIN = arr[j];
                idx = j;
            }


        }

        System.out.println(idx);

    }

}