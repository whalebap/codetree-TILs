import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        getNumberSquare(n);
    }

    private static void getNumberSquare(int n){
        int num = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                num += 1;
                System.out.print(num);
                System.out.print(" ");
                if(num >= 9){
                    num = 0;
                }
            }
            System.out.println();    
        }
    }
}