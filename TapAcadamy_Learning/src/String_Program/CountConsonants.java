package String_Program;
import java.util.*;
public class CountConsonants {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(printConsonantsCount(s));
	}

	public static int printConsonantsCount(String s) {
		// TODO Auto-generated method stub
		int cc = 0;
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if((ch >= 'A' && ch <= 'Z') || (ch >='a' && ch <= 'z')) 			{
				if(!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) 
				{
					cc++;
				}
			}
		}
		return cc;
	}
}
