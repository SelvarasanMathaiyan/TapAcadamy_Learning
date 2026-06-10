package Arrays;
import java.util.*;
public class Triangle_Game {
	void TriangleChecker(int a, int b, int c)
	{
		if((a + b + c)==180) {
			if((a == 60) && (b == 60) && (c == 60))
				System.out.println("3rd Price");
			else if((a == 90) || (b == 90) || (c == 90))
				System.out.println("2nd Price");
			else
				System.out.println("1st Price");
		}
		else
			System.out.println("No Price");
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Triangle_Game tg = new Triangle_Game();
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		tg.TriangleChecker(i, j, k);
	}
}
