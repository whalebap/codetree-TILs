import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

    Scanner sc = new Scanner(System.in);

    String str = sc.next();

    StringBuilder sb = new StringBuilder();
    int cnt = 1;
    char c = ' ';
    for(int i=1; i<=str.length(); i++){
        c = str.charAt(i-1);

        if(i == str.length()){
            sb.append(c);
            sb.append(cnt);
            break;
        }

        if(str.charAt(i-1)==str.charAt(i)){
            cnt ++;
        } else {
            if(cnt!=0){
                sb.append(c);
                sb.append(cnt);
            }
            cnt = 1;
        }
    }

    System.out.println(sb.toString().length());
    System.out.println(sb.toString());

    }
}