import java.util.Scanner;

public class Main {

    public static boolean checkLunarYear(int year){

        boolean isLunarYear = false;

        if(year % 4 == 0){
            isLunarYear = true;

            if(year % 200 == 0){
                isLunarYear = false;

                if(year % 400 == 0){
                    isLunarYear = true;
                }
            }

        }

        return isLunarYear;
    }

    public static boolean checkValidDay(int year, int month, int day){

        boolean isLunarYear = checkLunarYear(year);

        int maxDay = 31;

        if(month == 2){

            if(isLunarYear){
                maxDay = 29;
            } else {
                maxDay = 28;
            }

        } else if(month == 4 || month == 6 || month == 9 || month == 11){
            maxDay = 30;
        }

        return day <=maxDay;
    }


    public static void printSeason(int year, int month, int day){

        String season = "";
        
        if(month >= 3 && month <= 5){
            season = "Spring";
        } else if(month >= 6 && month <= 8){
            season = "Summer";
        } else if(month >= 9 && month <= 11){
            season = "Fall";
        } else {
            season = "Winter";
        }

        System.out.println(season);

    }

    public static void judgeSeasons(int year, int month, int day){

        if(!checkValidDay(year, month, day)){
            System.out.println("-1");
            return;
        }

        printSeason(year, month, day);
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        judgeSeasons(year, month, day);
    }
}