import java.util.Scanner;

class WeatherForecast {
    String date;
    String day;
    String weather;

    public WeatherForecast(String date, String day, String weather){
        this.date=date;
        this.day=day;
        this.weather=weather;
    }
}
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        WeatherForecast[] arr = new WeatherForecast[n+1];

        for(int i=0; i<=n; i++){
            
            if(i==n){
                arr[i] = new WeatherForecast("2100-12-31", "", "");  
                break;  
            }
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            arr[i] = new WeatherForecast(date, day, weather);
        }


        int idx = n;
        for(int j=1; j<=n; j++){
            if(arr[j].weather.equals("Rain")){
                if(arr[idx].date.compareTo(arr[j].date) >= 0){
                    idx = j;
                } 
            }
        }

        System.out.println(arr[idx].date + " " + arr[idx].day + " "+arr[idx].weather);
    }
}