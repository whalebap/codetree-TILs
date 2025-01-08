import java.util.Scanner;


public class Main {

    public static void checkPartSequence(int[] arr1, int[] arr2){

        int cnt = 0;
        for(int i=0; i<arr1.length; i++){
            
            if(arr1[i] == arr2[0]){

                if(arr2.length == 1){
                    cnt++;
                    break;
                }

                for(int j = i; j<i+arr2.length; j++){
                    if(i+arr2.length-1 >= arr1.length){
                        break;
                    }

                    if(arr1[j] == arr2[j-i]){
                        cnt ++;
                    }
                }
            }
        }

        

        if(cnt == arr2.length){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }


    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arr1 = new int[a];
        int[] arr2 = new int[b];

        for(int i = 0; i<a; i++){
            arr1[i] = sc.nextInt();
        }

        for(int j = 0; j<b; j++){
            arr2[j] = sc.nextInt();
        }

        checkPartSequence(arr1, arr2);
    }
}