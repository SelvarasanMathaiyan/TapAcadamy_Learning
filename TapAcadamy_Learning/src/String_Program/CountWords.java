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
		int count = 0;
		for (int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ') {
				count++;
			}
		}
		return str.charAt(0) == ' ' ? count : count + 1;
	}
}
