import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String first = sc.next();
        String second = sc.next();

        boolean isContain = first.indexOf(second) > -1;
        while(isContain){
            first = first.substring(0, first.indexOf(second)) + first.substring(first.indexOf(second)+second.length(), first.length());
            if(first.indexOf(second) == -1){
                isContain = false;
            }

        }

        System.out.println(first);

    }
}