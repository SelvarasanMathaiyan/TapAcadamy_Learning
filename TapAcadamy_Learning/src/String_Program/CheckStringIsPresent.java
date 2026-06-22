package String_Program;
import java.util.*;
public class CheckStringIsPresent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();//mississippi
		String t = sc.nextLine();//issi
		System.out.println(checkStringIsPresent(str, t)); //Yes
	}

	public static String checkStringIsPresent(String str, String t) {
		// TODO Auto-generated method stub
		// all substring check the given string is present
		int n = t.length();
		for(int i = 0; i <= str.length() - n; i++) {
			String temp = "";
			for(int j = i; j < n + i; j++) {
				temp += str.charAt(j);
			}
			if(temp.equals(t))
			return "Yes";
		}
		return "No";
	}
}
