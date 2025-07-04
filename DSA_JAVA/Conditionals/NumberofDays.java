import java.util.*;

public class NumberofDays {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        sc.close();

        int days;
        switch(M) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = 28;
                break;
            default:
                days = 0;
        }

        System.out.println(days);
    }
}
