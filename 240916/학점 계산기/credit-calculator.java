import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    double[] arr = new double[n];
    
    double sum = 0;
    for(int i=0; i<n; i++){
        arr[i] = sc.nextDouble();
        sum += arr[i];
    }

    double avg = sum / n;

    String msg = "Poor";
    if(avg >= 4.0) msg = "Perfect";
    else if(avg >= 3.0) msg = "Good";

    System.out.println(String.format("%.1f", avg));
    System.out.println(msg);

    

    }
}