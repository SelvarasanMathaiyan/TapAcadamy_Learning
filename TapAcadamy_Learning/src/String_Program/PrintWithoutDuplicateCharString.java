package String_Program;
import java.util.*;
public class PrintWithoutDuplicateCharString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();//hello
		System.out.println(printWithoutDuplicateCharString(str));//helo
	}

	public static String printWithoutDuplicateCharString(String str) {
		// TODO Auto-generated method stub
		String t = "";
		for(int i = 0; i < str.length(); i++) {
			Boolean flag = false;
			for(int j = 0; j < i; j++) {
				if(str.charAt(i) == str.charAt(j)) {
					flag = true;
				}
			}
			if(flag == false) {
				t += str.charAt(i);
			}
		}
		return t;
	}
}
