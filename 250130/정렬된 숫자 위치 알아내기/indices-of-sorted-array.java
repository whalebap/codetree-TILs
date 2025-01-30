import java.util.Scanner;
import java.util.Arrays;

class Element implements Comparable<Element>{

    int num;
    int originalIndex;
    int changedIndex;

    public Element(int num, int originalIndex){
        this.num = num;
        this.originalIndex = originalIndex;
    }

    @Override
    public int compareTo(Element ele){
        if(this.num == ele.num){
            return this.originalIndex - ele.originalIndex;
        }
        return this.num - ele.num;
    }
}
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Element[] arr = new Element[n];
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            arr[i] = new Element(num, i+1);
        }

        Arrays.sort(arr);
        
        int[] indexArr = new int[n];
        for(int j=0; j<n; j++){
            indexArr[j] = arr[j].originalIndex;
        }


        int[] changedIndexArr = new int[n+1];
        for(int k=0; k<n; k++){

            changedIndexArr[indexArr[k]] = (k+1);
        }
   

        for(int i=1; i<=n; i++){
            System.out.print(changedIndexArr[i]+ " ");
        }



    }
}