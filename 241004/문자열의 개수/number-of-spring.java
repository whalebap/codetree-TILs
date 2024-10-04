import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[200];

        int cnt = 0;
        for(int i=0; i<200; i++){
            String str = sc.next();
            if(str.charAt(0) == '0' && str.length() == 1){
                break;
            }

            arr[i] = str;
            cnt++;            
        }

        System.out.println(cnt);

        for(int j=0; j<cnt; j++){
            if((j+1)%2 != 0){
                System.out.println(arr[j]);
            }
        }
    }
}