import java.util.Scanner;

public class Main {

    public static void printSerialNum(int n){

        if(n == 0){
            return;
        }

        printSerialNum(n-1); 
        
        System.out.print(n + " ");
        
    }

    public static void printReverseNum(int n){

        if(n == 0){
            return;
        }
      
        System.out.print(n + " ");

        
        printReverseNum(n-1);
     
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printSerialNum(n);
        System.out.println("");
        printReverseNum(n);
    }

}