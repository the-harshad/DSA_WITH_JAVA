import java.util.*;

public class ConditionalProblem2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		if (N < 30) {
			System.out.println("less important");
		} else {
			System.out.println("more important");
		}
	}
}