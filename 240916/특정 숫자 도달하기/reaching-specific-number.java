import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    
    Scanner sc = new Scanner(System.in);

    // 500이하
    // 250이상의 정수는 마지막 수 제오하고, 합계 및 평균 구하기
    // 250미만의 정수가 없으면, 10개의 합계와 평균 구하기

    // 평균은 반올림해서 소수 첫째자리까지

    int[] arr = new int[10];
    boolean over250 = false;

    for(int i=0; i<10; i++){
        arr[i] = sc.nextInt();
    }

    double sum=0;
    int num =0; 
    for(int j=0; j<arr.length; j++){
        if(arr[j]<250){
            sum += arr[j];
            num = j+1;
        } else {
            break;
        }

    }

    double avg = Math.round((sum/num)*10)/10.0;

    System.out.println(String.valueOf((int)sum) + " "+ String.valueOf(avg));
}
}