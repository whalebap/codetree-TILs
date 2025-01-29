import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static String checkSameElement(int[] arr1, int[] arr2){

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

        int n = sc.nextInt();
        
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        for(int j=0; j<n; j++){
            arr2[j] = sc.nextInt();
        }
        
        System.out.println(checkSameElement(arr1, arr2));
    }
}