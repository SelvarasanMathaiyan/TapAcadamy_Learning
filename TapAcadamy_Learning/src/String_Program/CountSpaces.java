package String_Program;
import java.util.*;
public class CountSpaces {
	int countSpaces(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ')
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CountSpaces cs = new CountSpaces();
		String str = sc.nextLine();
		System.out.println(cs.countSpaces(str));
	}
}
