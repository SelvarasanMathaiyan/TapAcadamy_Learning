//You are give a String str, find the minimum characters required to append at the end of string str to make it a palindrome if str is already a palindrome print null.

package String_Program;
import java.util.*;
public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(checkPalindrome(str));
		System.out.println(checkPalindrome1(str));
	}
	public static boolean isPalindrome(String str) {
		int i = 0, j = str.length()-1;
		while(i <= j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}	
			i++; j--;
		}
		return true;
	}
	// This answer is how many characters to make the palindrome.
	public static String checkPalindrome(String str) {
		// TODO Auto-generated method stub
		if(isPalindrome(str)) {
			return null;
		}
		else {
			char ch[] = str.toCharArray();
			Arrays.sort(ch);
			int i = 0, errorCount = 0;
			while(i < ch.length) {
				if(i < ch.length-1 && ch[i] == ch[i+1]) {
					i += 2;
				}
				else {
					i++;
					errorCount++;
				}
			}
			return (errorCount > 0 )? String.valueOf(errorCount-1): String.valueOf(errorCount);
		}
	}
	// This answer is how many characters append at the end make the palindrome.
	public static String checkPalindrome1(String str) {
		// TODO Auto-generated method stub
		if(isPalindrome(str)) {
			return null;
		}
		else {
			for(int i = 0; i < str.length(); i++) {
				String sub = str.substring(i);
				System.out.println(sub);
				if(isPalindrome(str.substring(i))) {
					return String.valueOf(i);
				}
			}
		}
		return null;
	}
}
