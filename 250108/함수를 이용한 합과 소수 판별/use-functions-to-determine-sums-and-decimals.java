import java.util.Scanner;

public class Main {

    public static boolean isSumEven(int num){

        int a = num % 10;
        int b = 0;

        if(num >= 10){
            b = num / 10;
        }

        return (a + b) % 2 == 0;
    }

    public static boolean isDemical(int num){

        boolean isDemicalNum = true;

        for(int i = 2; i<num; i++){
            if(num % i == 0){
                isDemicalNum = false;
                break;
            }
        }
        
        return isDemicalNum;
    }

    public static boolean checkConditionalCnt(int i){

        return isDemical(i) && isSumEven(i);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;
        for (int i = a; i <= b; i++){
            if(checkConditionalCnt(i)){
                cnt++;
            }
        }

        System.out.println(cnt);
        // Please write your code here.
    }
}