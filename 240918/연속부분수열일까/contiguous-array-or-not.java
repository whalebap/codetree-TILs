import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for(int i=0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }

        for(int j=0; j<n2; j++){
            arr2[j] = sc.nextInt();
        }{

        int firstIndex=-1;
        int lastIndex=-1;
        String msg = "No";
        for(int k=0; k<n1; k++){
            
            if(arr1[k]==arr2[0]){
                firstIndex = k;
            }
            boolean isCoverableIndex = firstIndex > -1 && firstIndex + n2 <=n1;
            if(isCoverableIndex && arr1[firstIndex+n2-1] == arr2[n2-1]){
                msg="Yes";
                break;
            }
        }
        System.out.println(msg);
    }
}
}