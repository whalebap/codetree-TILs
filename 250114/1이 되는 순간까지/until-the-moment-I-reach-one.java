import java.util.Scanner;

public class Main {

    public static int getCountDivide(int n, int count){
        
        if(n == 1){
            return count;    
        }

        count++;

        if(n % 2 == 0){
            return getCountDivide(n / 2, count);
        } else {
            return getCountDivide(n / 3, count);
        }

        
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(getCountDivide(n, 0));
    }
}