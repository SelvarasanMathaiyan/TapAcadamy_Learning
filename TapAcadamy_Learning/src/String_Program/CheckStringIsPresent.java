package String_Program;
import java.util.*;
public class CheckStringIsPresent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String t = sc.nextLine();
		System.out.println(checkStringIsPresent(str, t));
	}

	public static String checkStringIsPresent(String str, String t) {
		// TODO Auto-generated method stub
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
