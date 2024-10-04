import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        // 질의는 2가지로 고정. 질의의 판별은 앞선 숫자로

        // 문자열 s
        String str = sc.next();
        // 질의 수
        int n = sc.nextInt();

        // 질의 배열
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            char[] charArr = str.toCharArray();
            int queryNum = sc.nextInt();
            if(queryNum == 1){
                int first = sc.nextInt()-1;
                int second = sc.nextInt()-1;

                char orginFirst = charArr[first];
                charArr[first] = charArr[second];
                charArr[second] = orginFirst;

            } else if(queryNum == 2){
                char firstStr = sc.next().charAt(0);
                char secondStr = sc.next().charAt(0);
                for(int j=0; j<charArr.length; j++){
                    if(charArr[j]==firstStr){
                        charArr[j] =secondStr;
                    }
                }
            }

            str = String.valueOf(charArr);
            System.out.println(str);

        }

    }
}