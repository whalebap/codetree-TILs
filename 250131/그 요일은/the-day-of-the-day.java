import java.util.Scanner;

public class Main {

    static String[] days = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    static int[] numOfMonth = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int getAbsDay(int month, int day){

        int count = 0;
        for(int i=1; i<month; i++){
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
        String day = sc.next();

        int firstCount = getAbsDay(m1, d1);
        int secondCount = getAbsDay(m2, d2);

        int gap = secondCount - firstCount;

        int times = (int)(gap/7);
        int spare = gap%7;

        int idx = 0;
        for(int i=0; i<days.length; i++){
            if(days[i].equals(day)){
                idx = i;
                break;
            }
        }

        int count = times;
        if(spare>=idx) count++;

        System.out.println(count);




    }
}