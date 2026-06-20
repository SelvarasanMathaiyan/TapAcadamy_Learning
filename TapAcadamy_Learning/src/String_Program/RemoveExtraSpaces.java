package String_Program;
import java.util.*;
public class RemoveExtraSpaces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(printRemoveExtraSpaces(str));//input--->       how    are     you   --->how are you
	}

	public static String printRemoveExtraSpaces(String str) {
		// TODO Auto-generated method stub
		String t ="";
		int si = 0, ei = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				si = i;
				break;
			}
		}
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) != ' ') {
				ei = i;
				break;
			}
		}
		for (int k = si; k <= ei; k++) {
			if((str.charAt(k) != ' ') || 
			  (str.charAt(k) == ' ' && str.charAt(k+1) != ' ')) {
				t += str.charAt(k);
			}
		}
		return t;
	}
}
