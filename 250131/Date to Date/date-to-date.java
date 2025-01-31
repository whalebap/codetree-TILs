
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] numOfDays = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};

        int days = 1;

        while(true){

            if(m1 == m2 && d1 == d2){
                break;
            }

            days++;
            d1++;

            if(d1 > numOfDays[m1]){
                d1 = 1;
                m1 ++;
            }
        }

        System.out.println(days);
    }


}