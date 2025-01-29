import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static String checkSameElement(char[] arr1, char[] arr2){

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        boolean isSame = true;

        for(int i=0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]){
                isSame = false;
                break;
            }
        }

        return isSame ? "Yes" : "No";
    }
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        String first = sc.next();
        String second = sc.next();

        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();

        if(firstArray.length != secondArray.length){
            System.out.println("No");
            return;
        }

        System.out.println(checkSameElement(firstArray, secondArray));
    }
}