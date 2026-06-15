// HackerRankProblem - Repeated String
// find the character 'a' in the given string. but given string is infinite string
package String_Program;
import java.util.*;
public class RepeatedStringHRP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		long n = sc.nextInt();
		System.out.println(findTheCountOfCharacter(s, n));
		
	}

	public static long findTheCountOfCharacter(String s, long n) {
		// TODO Auto-generated method stub
		// count1 is how many time 'a' present in the given String * full repeated set of string.
		long count1 = 0;
		long count2 = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'a') {
				count1++;
			}
		}
		long repeat = n / s.length();
		count1 = count1 * repeat;
		
		// count2 is remaining repeated string character 'a' present
		long remain = n % s.length();
		for(int i = 0; i < remain; i++) {
			if(s.charAt(i) == 'a') {
				count2++;
			}
		}
		return count1 + count2;
	}
}
