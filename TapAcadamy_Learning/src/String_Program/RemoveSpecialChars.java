package String_Program;
import java.util.*;
public class RemoveSpecialChars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(printRemoveSpecialChar(str));//input-->He##o--->Heo
	}

	public static String printRemoveSpecialChar(String str) {
		// TODO Auto-generated method stub
		String t = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
				t += ch;
			}
		}
		return t;
	}
}
