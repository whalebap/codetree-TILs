import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

    Scanner sc = new Scanner(System.in);

    String text = sc.next();
    
    int n = sc.nextInt();

    for(int i=0; i<n; i++){
        int query = sc.nextInt();

        if(query == 1){
            String first = text.substring(0, 1);
            text = text.substring(1, text.length()).concat(first);

        } else if(query == 2){
            String last = text.substring(text.length()-1, text.length());
            text = last.concat(text.substring(0, text.length()-1));

        } else if(query == 3){
            char[] arr = text.toCharArray();
            char[] arr2 = text.toCharArray();
            for(int j=0; j<arr.length; j++){
                arr2[j] = arr[arr.length-j-1];
            }
            text = String.valueOf(arr2);
        }
       
       System.out.println(text);

    }
    }
}