import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            
        }

        for(int j=0; j<q; j++){
            int first = sc.nextInt();
            int second = sc.nextInt();
            int third = 0;
            if(first == 3){
                third = sc.nextInt();
            }

            if(first == 1){
                System.out.println(arr[second-1]);
            }

            if(first == 2){
                int idx = -1;

                for(int k=0; k<n; k++){
                    if(arr[k]==second){
                        idx=k;
                        break;
                    }
                }
                if(idx >-1){
                    System.out.println(idx+1);
                } else {
                    System.out.println(0);
                }
                
            }

            if(first == 3){
                for(int l=second; l<=third; l++){
                    System.out.print(arr[l-1] + " ");
                }
                System.out.println();
            }
            
        }
    }
}