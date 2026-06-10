package String_Program;
import java.util.*;
public class StringBuiltInMethods {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s1 = sc.nextLine();
		//String s2 = sc.nextLine();
		String str = sc.nextLine();
		String t = sc.nextLine();
		//String ch = sc.nextLine();
		//int k = sc.nextInt();
		System.out.println(contains(str, t));
		//System.out.println(endsWith(str, ch));
		//System.out.println(startsWith(str, ch));
		//System.out.println(equals(s1, s2));
		//System.out.println(trim(str));
		//System.out.println(lastIndexOf(str, ch));
		//System.out.println(indexOf(str, ch, k));
		//System.out.println(indexOf(str, ch));
		//System.out.println(toLowerCase(str));
		//System.out.println(toUpperCase(str));
	}
	public static boolean contains(String str, String t) {
		int count = 0;
		if(str.length() < t.length()) {
			return false;
		}
		for (int i = 0; i < str.length() && count < t.length(); i++) {
			if(str.charAt(i) == t.charAt(count))
				count++;
			else
				count = 0;
		}
		if(count == t.length())
			return true;
		else
			return false;
	}

	public static boolean endsWith(String str, String ch) {
		if(str.length() < ch.length()) {
			return false;
		}
		int i = ch.length()-1, j = str.length()-1;
		while(i >= 0) {
			if(ch.charAt(i--) != str.charAt(j--)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean startsWith(String str, String ch) {
		// TODO Auto-generated method stub
		if(str.length() < ch.length()) {
			return false;
		}
		for (int i = 0; i < ch.length(); i++) {
			if(str.charAt(i) != ch.charAt(i))
				return false;
		}
		return true;
	}

	public static Boolean equals(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				if(s1.charAt(i) != s2.charAt(i))
					return false;
			}
			return true;
		}
		else {
			return false;
		}
	}

	public static String trim(String str) {
		// TODO Auto-generated method stub
		String t = "";
		int si = 0, ei = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				si = i;
				break;
			}
		}
		for (int i = str.length()-1; i >= 0; i--) {
			if (str.charAt(i) != ' ') {
				ei = i;
				break;
			}
		}
		for (int i = si; i <= ei; i++) {
			t += str.charAt(i);
		}
		return t;
	}

	public static int lastIndexOf(String str, String ch) {
		// TODO Auto-generated method stub
		char key = ch.charAt(0);
		for (int i = str.length()-1; i >= 0; i--) {
			if(str.charAt(i) == key) {
				return i;
			}
		}
		return -1;
	}

	public static int indexOf(String str, String ch, int k) {
		// TODO Auto-generated method stub
		char key = ch.charAt(0);
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == key) {
				count++;
			}
			if(count == k) {
				return i;
			}
		}
		return -1;
	}
	
	public static int indexOf(String str, String ch) {
		// TODO Auto-generated method stub
		char key = ch.charAt(0);
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == key) {
				return i;
			}
		}
		return -1;
	}

	public static String toUpperCase(String str) {
		// TODO Auto-generated method stub
		String t = "";
		for (int i = 0; i < str.length(); i++) {
			char key = str.charAt(i);
			if (key >= 97 &&  key <= 122) {
				t += (char)(key - 32);
			}	
			else {
				t += key;
			}
		}
		return t;
	}
	
	public static String toLowerCase(String str) {
		// TODO Auto-generated method stub
		String t = "";
		for (int i = 0; i < str.length(); i++) {
			char key = str.charAt(i);
			if (key >= 65 &&  key <= 90) {
				t += (char)(key + 32);
			}	
			else {
				t += key;
			}
		}
		return t;
	}
}
