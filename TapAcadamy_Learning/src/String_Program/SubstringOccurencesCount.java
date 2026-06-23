package String_Program;
import java.util.*;
public class SubstringOccurencesCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();//mississippi
		String str2 = sc.nextLine();//issi
		System.out.println(printSubstringOccurencesCount(str1, str2));//2
	}

	public static int printSubstringOccurencesCount(String str1, String str2) {
		// TODO Auto-generated method stub
		int size = str2.length();
		int count = 0;
;		for (int i = 0; i <= str1.length() - size; i++) {
			String temp = "";
			for(int j = i; j < size + i; j++) {
				temp += str1.charAt(j);
			}
			if(str2.equals(temp)) {
				count++;
			}
		}
		
		return count;
	}
}
