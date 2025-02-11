import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        String numToString = String.valueOf(n);


        int demical = 0;

        for(int i = numToString.length()-1; i>=0; i--){
            char bit =  numToString.charAt(i);
 
            if(bit == '1'){
                demical += Math.pow(2, cnt);
            }

            cnt++;
        }

        demical *= 17;
        int[] digits = new int[10];
        cnt = 0;

        while(true){
            if(demical < 2){
                digits[cnt++] = demical;
                break;
            }

            digits[cnt++] = demical % 2;
            demical /= 2;
        }


        for(int i=cnt-1; i>=0; i--){
            System.out.print(digits[i]);
        }

    }
}