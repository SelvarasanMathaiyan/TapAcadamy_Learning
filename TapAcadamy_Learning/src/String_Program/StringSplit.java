package String_Program;
import java.util.*;
public class StringSplit {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String arr[] = split(str);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static String[] split(String str) {
		int count = countWords(str);
		String arr[] = new String[count];
		int j = 0;
		String temp = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				temp += str.charAt(i);
			}
			else if(temp.length() > 0){
				arr[j] = temp;
				j++;
				temp = "";
			}
		}
		if(temp.length() > 0) {
			arr[j] = temp;
		}
		return arr;
	}
	
	public static int countWords(String str) {
		int count = 0;
		for(int i = 0; i < str.length() - 1; i++) {
			if(str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
				count++;
			}
		}
		return str.charAt(0) == ' ' ? count : count + 1;
	}
}
