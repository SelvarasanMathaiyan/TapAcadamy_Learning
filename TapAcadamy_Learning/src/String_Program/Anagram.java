package String_Program;
import java.util.*;
public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(isAnagram(s1, s2));
	}

	public static boolean isAnagram(String s1, String s2) {
		// TODO Auto-generated method stub
		
		// remove the spaces
		String temp = "";
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != ' ') {
				temp += s1.charAt(i);
			}
		}
		s1 = temp;
		temp = "";
		for (int i = 0; i < s2.length(); i++) {
			if (s2.charAt(i) != ' ') {
				temp += s2.charAt(i);
			}
		}
		s2 = temp;
		
		// convert to lowercase
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		// convert to char array
		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();
		
		// array sort
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		// convert to string
		s1 = new String(arr1);
		s2 = new String(arr2);

		return s1.equals(s2);
	}
}
