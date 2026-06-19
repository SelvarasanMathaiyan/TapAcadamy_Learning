package String_Program;
import java.util.*;
public class AlterChars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(printAlternatedAlphaAndNums(str)); //input--> H2ell1@0o-->Hello@210
		System.out.println(printAlternatedAlphaAndSums(str)); //input--> H2ell1@0o-->Hello@3
	}
	
	public static String printAlternatedAlphaAndSums(String str) {
		// TODO Auto-generated method stub
		String alpha = "", spc = "";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				alpha += ch;
			} 
			else if(ch >= '0' && ch <= '9'){
				sum += (int)(ch - 48);
			} 
			else {
				spc += ch;
			}
		}
		return alpha + spc + sum;
	}
	

	public static String printAlternatedAlphaAndNums(String str) {
		// TODO Auto-generated method stub
		String alpha = "", nums = "", spc = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				alpha += ch;
			} 
			else if(ch >= '0' && ch <= '9'){
				nums += ch;
			} 
			else {
				spc += ch;
			}
		}
		return alpha + spc + nums;
		
	}
}
