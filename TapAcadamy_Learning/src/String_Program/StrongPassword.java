package String_Program;
import java.util.*;
public class StrongPassword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String password = sc.nextLine();
		System.out.println(checkStrongPassword(n, password));
	}

	public static int checkStrongPassword(int n, String password) {
		// TODO Auto-generated method stub
			int length = password.length();
			int number = 0, lowerCase = 0, upperCase = 0, splChar = 0;
			for (int i = 0; i < password.length(); i++) {
				char ch = password.charAt(i);
				if(ch >= '0' && ch <= '9') {
					number = 1;
				}
				else if(ch >= 'a' && ch <= 'z') {
					lowerCase = 1;
				}
				else if(ch >= 'A' && ch <= 'Z') {
					upperCase = 1;
				}
				else if(ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch == '&' || ch == '*' || ch == '(' || ch == ')' || ch == '-' || ch == '+') {
					splChar = 1;
				}
			}
			int total = number+lowerCase+upperCase+splChar;
			int missing = 4 - total;
			if(missing < 6 - length)
				return 6 - length;
			else
				return missing;
		}
}
