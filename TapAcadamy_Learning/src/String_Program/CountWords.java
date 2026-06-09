package String_Program;
import java.util.*;
public class CountWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(countWords(str));
	}

	public static int countWords(String str) {
		// TODO Auto-generated method stub
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
	}
}
