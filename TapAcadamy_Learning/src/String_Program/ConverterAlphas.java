package String_Program;
import java.util.*;
public class ConverterAlphas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(converter(str)); //input-->HELLO world--->hello WORLD

	}

	public static String converter(String str) {
		// TODO Auto-generated method stub
		String t = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <='Z') {
				t += (char)(ch + 32);
			}
			else if(ch >= 'a' && ch <='z') {
				t += (char)(ch - 32);
			}
			else {
				t += ch;
			}
		}
		return t;
	}
}
