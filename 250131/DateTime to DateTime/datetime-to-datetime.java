import java.util.Scanner;

public class Main {

    public static boolean checkValidDay(int day, int hour, int minute){

        boolean isValid = false;
        if(day >11){
            return true;
        }
        if(day == 11 && hour >11){
            return true;
        }
        if(day == 11 && hour == 11 && minute >= 11){
            return true;
        }
        return isValid;
        
    }

    public static int caculateMinutes(int day, int hour, int minute){
       

        int passedMinutes = 0;
        
        int initDay = 11;
        int initHour = 11;
        int initMinute = 11;


        while(true){
            if(initDay == day && initHour == hour && initMinute == minute){
                break;
            }

            passedMinutes++;
            initMinute++;

            if(initMinute >= 60){
                initMinute = 0;
                initHour++;
            }

            if(initHour >= 24){
                initHour = 0;
                initDay++;
            }    
        }

        return passedMinutes;
    }
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        boolean isValidDay = checkValidDay(day, hour, minute);
        if(isValidDay){
            System.out.println(caculateMinutes(day, hour, minute));
        } else {
            System.out.println(-1);
        }
        
       
    }
}