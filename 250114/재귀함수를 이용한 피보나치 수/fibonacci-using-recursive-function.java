import java.util.Scanner;


public class Main {

    public static int getNum(int n){

        if(n<=1){
            return n;
        }

        return getNum(n-2) + getNum(n-1);
    }
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(getNum(n));
    }
}