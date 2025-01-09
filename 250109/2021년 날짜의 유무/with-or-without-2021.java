import java.util.Scanner;

public class Main {

    public static boolean checkCalendar(int month, int day){
        
        int maxDay = 31;

        if(month == 2){
            maxDay = 28;
        } else if(month == 8){
            maxDay = 31;
        } else if(month % 2 ==0){
            maxDay = 30;
        }
        
        return day <= maxDay;
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();

        if(checkCalendar(month, day)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}