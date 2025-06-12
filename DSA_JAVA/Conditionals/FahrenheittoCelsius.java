import java.util.*;

public class FahrenheittoCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempInFahr = sc.nextInt();
        int tempInCelsius = (tempInFahr - 32) * 5 / 9;
        System.out.println(tempInCelsius);
    }
}

