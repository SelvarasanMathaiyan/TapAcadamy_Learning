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
	//another method
//	public static String findLongestPalinSubstring(String str){
//	    for(int size = str.length(); size >= 1; size--)
//	    {
//	        for(int i = 0; i <= str.length() - size; i++)
//	        {
//	             String temp = "";
//	             for(int j = i; j < size + i; j++)
//	             {
//	                 temp += str.charAt(j);
//	             } 
//	             if(isPalindrome(temp))
//	            	return temp;
//	        }
//	    }
//	    return null;
//	}
}
