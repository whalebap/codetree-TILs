import java.util.Scanner;

public class Main {

    public static int getDoubleSum(int n){

        if(n < 10){
            return n * n;
        }

        return getDoubleSum(n / 10) + (n % 10) * (n % 10);
    }
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(getDoubleSum(n));
    }
}