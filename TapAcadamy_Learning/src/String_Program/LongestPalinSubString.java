package String_Program;
import java.util.*;
public class LongestPalinSubString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(findLongestPalinSubstring(str));
	}

	public static boolean isPalindrome(String str) {
		// TODO Auto-generated method stub
		int i = 0, j = str.length()-1;
		while(i <= j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++; j--;
		}
		return true;
		
	}

	public static String findLongestPalinSubstring(String str) {
		// TODO Auto-generated method stub
		String res = "";
		for(int len = 1; len <= str.length(); len++) {
			for(int si = 0; si <= str.length() - len; si++) {
				String temp = "";
				for(int ei = si; ei < si+len; ei++) {
					temp += str.charAt(ei);
				}
				if(isPalindrome(temp)) {
					if(res.length() < temp.length())
						res = temp;
				}
			}
		}
		return res;
	}
}
