import java.util.Scanner;

class Person {
    String name;
    String addr;
    String city;

    public Person(String name, String addr, String city){
        this.name = name;
        this.addr = addr;
        this.city = city;
    }
}
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Person[] arr = new Person[n];

        for(int i=0; i<n; i++){
            String name = sc.next();
            String addr = sc.next();
            String city = sc.next();

            arr[i] = new Person(name, addr, city);
        }

        int idx = 0;

        for(int j=0; j<n; j++){
            if(j== n-1){
                break;
            }
            if((arr[j].name).compareTo(arr[j+1].name) < 0){
                idx = j+1;
            }
        }

        System.out.println("name "+ arr[idx].name);
        System.out.println("addr "+ arr[idx].addr);
        System.out.println("city "+ arr[idx].city);
    }
}