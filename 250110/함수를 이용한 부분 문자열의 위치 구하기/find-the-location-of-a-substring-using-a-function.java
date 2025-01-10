import java.util.Scanner;

public class Main {

    public static String m = "";
    public static String n = "";

    public static boolean checkSame(int index){
        
        
        for(int i=0; i<n.length(); i++){
           
            if(m.charAt(index + i) != n.charAt(i)){
                return false;
            }
        }

        return true;
    }

    public static void checkContainString(){

        int index = -1;

        for(int i=0; i<m.length(); i++){
            
            if(m.charAt(i) == n.charAt(0)){

                if(i + n.length() > m.length()){
                    continue;
                }
                if(checkSame(i)){
                    index = i;
                    if(i > 0){
                        break;
                    }
                }
            }
            
            
        }

        System.out.println(index);
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        m = sc.next();
        n = sc.next();

        checkContainString();
    }
}