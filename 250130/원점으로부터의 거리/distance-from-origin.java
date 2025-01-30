import java.util.Scanner;
import java.util.Arrays;

class Spot implements Comparable<Spot>{
    int x, y, distance, num;

    public Spot(int x, int y, int distance, int num){
        this.x=x;
        this.y=y;
        this.distance=distance;
        this.num=num;
    }

    @Override
    public int compareTo(Spot spot){
        if(this.distance == spot.distance){
            return this.num - spot.num;
        }
        return this.distance - spot.distance;
    }
}
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Spot[] arr = new Spot[n];

        for(int i=0; i<n; i++){
            int x =  sc.nextInt();
            int y = sc.nextInt();
            int distance = Math.abs(x) + Math.abs(y);
            arr[i] = new Spot(x, y, distance, i+1);
        }

        Arrays.sort(arr);

        for(int j=0; j<n; j++){
            System.out.println(arr[j].num);
        }


    }
}