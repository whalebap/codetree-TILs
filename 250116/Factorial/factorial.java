import java.util.Scanner;

public class Main {

    public static int getFactorialNum(int n){

        if(n == 1){
            return 1;
        }

        return getFactorialNum(n-1) * n;
    }
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(getFactorialNum(n));
    }
}