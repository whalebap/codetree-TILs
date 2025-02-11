import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next();

        // 8진수로 주어진 11을 10진수로 변환한 뒤 2진수로 변환한다.

        int demical = 0;
        int cnt = 0;
        for(int i=c.length()-1; i>=0; i--){
            char nc = c.charAt(i);
            
            int n = nc - '0'; // 숫자로 만들기
            demical += n * Math.pow(a, cnt);
            cnt++;   
        }


        int[] digits = new int[20];
        cnt = 0;

        while(true){

            if(demical < b){
                digits[cnt++] = demical;
                break;
            }

            digits[cnt++] = demical % b;
            demical /= b;
        }

        for(int i = cnt-1; i>=0; i--){
            System.out.print(digits[i]);
        }
    }
}