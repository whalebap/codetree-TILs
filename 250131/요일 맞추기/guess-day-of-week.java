import java.util.Scanner;
import java.util.Collections;


public class Main {

    static String[] days = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    static String[] reversedDays = new String[]{"Mon", "Sun", "Sat", "Fri", "Thu", "Wed", "Tue"};
    
    static int[] numOfMonth = new int[]{0, 31,28,31,30,31,30,31,31,30,31,30,31};

    public static int getAbsDay(int month, int day){

        int count = 0;
        for(int i=1; i<=month; i++){
            count += numOfMonth[i];
        }
        count += day;

        return count;
    }
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int firstCount = getAbsDay(m1, d1);
        int secondCount = getAbsDay(m2, d2);

        int gap = secondCount - firstCount;
        gap %= 7;

        String answer = "";

        if(gap >= 0){
            
            answer = days[gap];
            
        } else {
            answer = reversedDays[Math.abs(gap)];
        }

        System.out.println(answer);



    }
}