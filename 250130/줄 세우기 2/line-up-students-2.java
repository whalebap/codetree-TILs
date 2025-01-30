import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student>{

    int height, weight, number;

    public Student(int height, int weight, int number){
        this.height = height;
        this.weight = weight;
        this.number = number;
    }

    @Override
    public int compareTo(Student student){
        if(student.height == this.height){
            return student.weight - this.weight;
        }
        return this.height - student.height;
    }
}
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        // 키 오름 > 몸무게 내림 

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Student[] arr = new Student[n];

        for(int i=0; i<n; i++){
            int height = sc.nextInt();
            int weight = sc.nextInt();
            arr[i] = new Student(height, weight, i+1);
        }

        Arrays.sort(arr);

        for(int j=0; j<n; j++){
            System.out.print(arr[j].height + " "+ arr[j].weight + " "+ arr[j].number);
            System.out.println("");
        }
        



    }
}