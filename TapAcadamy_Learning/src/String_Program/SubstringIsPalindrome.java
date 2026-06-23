package String_Program;
import java.util.*;
public class SubstringIsPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();//mississippi
		int n = sc.nextInt();//4
		printSubstringIsPalindrome(str, n);//issi,issi,ippi
	}

	public static void printSubstringIsPalindrome(String str, int n) {
		// TODO Auto-generated method stub
		for(int i = 0; i <= str.length()-n; i++) {
			String temp = "";
			for(int j = i; j < n+i; j++) {
				temp += str.charAt(j);
			}
			if(isPalindrome(temp)) {
				System.out.println(temp);
			}
		}
	}
	public static boolean isPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		while(i <= j) {
			if(s.charAt(i) !=  s.charAt(j)) {
				return false;
			}
			i++; j--;
		}
		return true;
	}
	
}
