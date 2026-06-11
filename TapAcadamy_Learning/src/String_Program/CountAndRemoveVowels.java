package String_Program;
import java.util.*;
public class CountAndRemoveVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//System.out.println(countVowels(str));
		System.out.println(removeVowels(str));
	}

	public static String removeVowels(String str) {
		// TODO Auto-generated method stub
		String t = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				t += "";
			}
			else {
				t += ch;
			}
				
		}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
		return t;
	}

	public static int countVowels(String str) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
				count++;
		}
		return count;
	}
}
