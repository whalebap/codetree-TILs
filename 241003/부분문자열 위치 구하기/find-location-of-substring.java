import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

    Scanner sc = new Scanner(System.in);

    String full = sc.next();
    String part = sc.next();

    System.out.println(full.indexOf(part));

    }
}