import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

    Scanner sc = new Scanner(System.in);
    // 배열 선언
    // 정수를 입력받다가 10이 입력되면 10개 입력이 끝나지 않더라도
    // 입력된 정수를 역순으로 출력

    int[] arr = new int[10];

    for(int i=0; i<10; i++){
        int num = sc.nextInt();
        if(num !=0){
            arr[i] = num;
        } else {
            break;
        }
    }

    String str = "";
    for(int j=10; j>0; j--){
        if(arr[j-1]!=0){
            str += arr[j-1];
            str += " ";
        }
    }

    System.out.println(str);
    }
}