import java.util.Scanner;

public class Main {

    public static boolean checkDifferentStr(String[] str){

        boolean isDifferent = false;

        for(int i=0; i<str.length; i++){
            if(i == str.length -1){
                break;
            }

            if(!str[i].equals(str[i+1])){
                isDifferent = true;
                break;
            }
        }

        return isDifferent;
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        String[] arr = a.split("");
        

        if(checkDifferentStr(arr)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}