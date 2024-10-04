import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String firstStr = sc.next();
        String first = "";

        char[] arr = firstStr.toCharArray();
        for(int i=0; i<arr.length; i++){     
            if(!Character.isDigit(arr[i])){
                break;
            } else {
                first += arr[i];
            }
        }

        String secondStr = sc.next();
        String second = "";

        arr = secondStr.toCharArray();
        for(int i=0; i<arr.length; i++){
            
              if(!Character.isDigit(arr[i])){
                break;
            } else {
                second += arr[i];
            }
        }

        System.out.println(Integer.parseInt(first) + Integer.parseInt(second));
    }
}