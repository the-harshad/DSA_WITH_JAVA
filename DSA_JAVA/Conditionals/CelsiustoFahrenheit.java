
import java.util.*;

public class CelsiustoFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempInCelsius = sc.nextInt();
        sc.close();

        int tempInFahrenheit = (tempInCelsius * 9) / 5 + 32;
        System.out.println(tempInFahrenheit);
    }
}
