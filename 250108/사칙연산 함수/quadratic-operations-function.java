import java.util.Scanner;

public class Main {

    public static void printCalculate(int a, char o, int c){

        int answer = 0;
        boolean isCalculateStr = true;
        switch(o){
            case '+' : answer = a + c;
            break;
            case '-' : answer = a - c;
            break;
            case '*' : answer = a * c;
            break;
            case '/' : answer = a / c;
            break;
            default : isCalculateStr = false;
                   
        }

        if(isCalculateStr){
            System.out.println(String.valueOf(a) + " " + 
            String.valueOf(o) + " " + String.valueOf(c) + " = " 
            + String.valueOf(answer));
        } else {
            System.out.println("False");
        }

        
        
    }

    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();


        
        printCalculate(a, o, c);
        
        
    }
}