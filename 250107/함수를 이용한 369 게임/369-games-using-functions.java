import java.util.Scanner;

public class Main {

    public static boolean isThreeMultiple(int i){

        return i % 3 ==0;
    }

    public static boolean isContainNumber(int i){

        String[] numStrArr = new String[]{"3", "6", "9"};

        boolean isContain = false;

        for(int j = 0; j<numStrArr.length; j++){
            if(String.valueOf(i).contains(numStrArr[j])){
                isContain = true;
                break;
            }
        }

        return isContain;
    }

    public static boolean isCheckConditon(int i){


        return isThreeMultiple(i) || isContainNumber(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;
        for(int i = a; i<=b; i++){
            if(isCheckConditon(i)){
                cnt++;
            }
        }

        System.out.println(cnt);
            // Please write your code here.
    }
}