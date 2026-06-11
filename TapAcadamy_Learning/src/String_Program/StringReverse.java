package String_Program;
import java.util.*;
public class StringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s);
		s = reverse(s);
		System.out.println(s);
	}

	public static String reverse(String s) {
		// TODO Auto-generated method stub
		int i = 0, j = s.length() - 1;
		char ch[] = s.toCharArray();
		while(i <= j) {
			char temp = ch[j];
			ch[j] = ch[i];
			ch[i] = temp;
			i++; j--;
		}
		return new String(ch);
	}
}
