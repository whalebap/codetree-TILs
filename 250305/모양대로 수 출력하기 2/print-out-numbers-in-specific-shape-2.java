import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num = 2;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(num >= 10){
                    num = 2; 
                }
                System.out.print(num + " ");
                num += 2;
            }
            System.out.println("");
        }
    }
}