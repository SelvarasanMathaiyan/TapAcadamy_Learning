package String_Program;
import java.util.*;
public class PrintSubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int k = sc.nextInt();
		//printAllSubString(str);
		printSubString(str, k);
	}

	public static void printSubString(String str, int k) {
		// TODO Auto-generated method stub
		int n = str.length();
		for (int i = 0; i <= n - k ; i++) {
			for(int j = i; j <= (i + k)-1; j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}

	public static void printAllSubString(String str) {
		// TODO Auto-generated method stub
		int n = str.length();
		for(int len = 1; len <= n; len++) {
			for(int si = 0; si <= n-len; si++) {
				for(int ei = si; ei <= (si + len)-1; ei++) {
					System.out.print(str.charAt(ei));
				}
				System.out.println();
			}
		}
		
	}
}
