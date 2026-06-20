package String_Program;
import java.util.*;
public class CheckSubsequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();//hereiamstackerrank
		String str2 = sc.nextLine();//hackerrank
		System.out.println(checkStringSubsequence(str1, str2));//Yes
		
	}

	public static String checkStringSubsequence(String str1, String str2) {
		// TODO Auto-generated method stub
		int i = 0, j = 0;
		while(i < str1.length() && j < str2.length()) {
			if(str1.charAt(i) == str2.charAt(j)) {
				i++; j++;
			}
			else {
				i++;
			}
		}
		return j == str2.length() ? "Yes" : "No";
	}
}
