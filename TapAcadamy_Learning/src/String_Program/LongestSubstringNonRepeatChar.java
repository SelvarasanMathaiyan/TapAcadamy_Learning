package String_Program;
import java.util.*;
public class LongestSubstringNonRepeatChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printLongestSubstringNonRepeatedCharacter(str);
		printLongestSubstringNonRepeatedCharacterLength(str);
	}

	public static void printLongestSubstringNonRepeatedCharacter(String str) {
		// TODO Auto-generated method stub
		String res = "";
		for(int i = 0; i < str.length(); i++) {
			String temp = "";
			for(int j = i; j < str.length(); j++) {
				if(temp.indexOf(str.charAt(j)) == -1) {
					temp += str.charAt(j);
				}
				else {
					break;
				}
			}
			if(temp.length() > res.length()) {
				res = temp;
			}
		}
		System.out.println(res);
	}
	
	//same as
	public static void printLongestSubstringNonRepeatedCharacterLength(String str) {
		// TODO Auto-generated method stub
		String res = "";
		for(int i = 0; i < str.length(); i++) {
			String temp = "";
			for(int j = i; j < str.length(); j++) {
				if(temp.indexOf(str.charAt(j)) == -1) {
					temp += str.charAt(j);
				}
				else {
					break;
				}
			}
			if(temp.length() > res.length()) {
				res = temp;
			}
		}
		System.out.println(res.length());
	}
}
