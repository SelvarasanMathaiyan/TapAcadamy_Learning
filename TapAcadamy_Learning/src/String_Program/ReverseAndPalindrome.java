package String_Program;
import java.util.*;
public class ReverseAndPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println((isPalindrome(str))? "It is Palindrome" :"It is not Palindrome");
	}
	
	// check the palindrome method 1
//	public static boolean isPalindrome(String str) {
//		// TODO Auto-generated method stub
//		return (str.equals(reverse(str))) ? true : false;
//	}
	
	// check the palindrome method 2
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
	
	// reverse the string
	public static String reverse(String str) {
		// TODO Auto-generated method stub
		String rev = "";
		for (int i = str.length()-1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev);
		return rev;
	}
}
