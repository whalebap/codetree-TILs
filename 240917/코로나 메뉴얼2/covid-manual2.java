import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];
        for(int i=0; i<3; i++){
            String yn = sc.next();
            int tmp = sc.nextInt();

            if(yn.equals("Y") && tmp >=37){
                arr[0]++;
            } else if(yn.equals("N") && tmp >=37){
                arr[1]++;
            } else if(yn.equals("Y") && tmp<37 ){
                arr[2]++;
            } else {
                arr[3]++;
            }
        }

        String msg = "";
        for(int i=0; i<arr.length; i++){
            if(arr[0] >=2){
                msg = "E";
            }

            System.out.print(arr[i] + " ");
        }
         System.out.print(msg);
        // 여기에 코드를 작성해주세요.
    }
}