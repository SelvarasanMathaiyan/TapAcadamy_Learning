package Arrays;
import java.util.*;
public class Count_Divisiors {
	int DividerCount(int start, int end, int divide) {
		int count = 0;
		for(int i = start; i <= end; i++) {
			if(i % divide == 0)
				count++;
		}
		return count;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Count_Divisiors cd = new Count_Divisiors();
		int start = sc.nextInt();
		int end = sc.nextInt();
		int divide = sc.nextInt();
		System.out.println(cd.DividerCount(start, end, divide));
	}
}
