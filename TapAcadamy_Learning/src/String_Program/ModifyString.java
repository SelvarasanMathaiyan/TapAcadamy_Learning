package String_Program;
import java.util.*;
public class ModifyString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(printStarBeforeA(str));//BanAna --->B*an*An*a
	}

	public static String printStarBeforeA(String str) {
		// TODO Auto-generated method stub
		String t = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a' ||  str.charAt(i) == 'A') {
				t += "*" + str.charAt(i);
			}
			else {
				t += str.charAt(i);
			}
		}
		return t;
	}
}
