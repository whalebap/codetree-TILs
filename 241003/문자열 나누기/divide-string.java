import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    int[] arr = new int[num];

    StringBuilder sb = new StringBuilder();
    for(int i=0; i<num; i++){
        arr[i] = sc.nextInt();
        sb.append(String.valueOf(arr[i]));
    }

    String str = sb.toString();


    for(int j=0; j<str.length(); j++){
        System.out.print(str.charAt(j));
        if((j+1)%5==0){
            System.out.println("");
        }
    }


    }
}