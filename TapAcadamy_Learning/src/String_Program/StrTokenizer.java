package String_Program;
import java.util.*;
public class StrTokenizer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
//		StringTokenizer st = new StringTokenizer(str);
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//		}
		StringTokenizer st = new StringTokenizer(str, "_"); // split by A
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
