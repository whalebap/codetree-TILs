import java.util.Scanner;

class Student {
    String name;
    int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    public Student(){
    }

}
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        Student[] arr = new Student[5];

        for(int i=0; i<5; i++){
            String name = sc.next();
            int score = sc.nextInt();
            arr[i] = new Student(name, score);
        }

        int min = 100;
        String who = "";
        for(int j=0; j<5; j++){
            if(arr[j].score < min){
                min = arr[j].score;
                who = arr[j].name;
            }
        }

        System.out.print(who + " " + min);

    }
}