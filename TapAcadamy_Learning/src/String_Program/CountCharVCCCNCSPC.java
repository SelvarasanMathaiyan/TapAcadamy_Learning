package String_Program;
import java.util.*;
public class CountCharVCCCNCSPC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		printCharCounts(s);
	}

	public static void printCharCounts(String s) {
		// TODO Auto-generated method stub
		int vc = 0, cc = 0, nc = 0, spc = 0;
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if((ch >= 'A' && ch <= 'Z') || (ch >='a' && ch <= 'z')) 			{
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
				{
					vc++;
				}
				else
				{
					cc++;
				}
			}
			else if(ch >= '0' && ch <='9')
			{
				nc++;
			}
			else
			{
				spc++;
			}	
		}
		System.out.println("VC = "+vc);
		System.out.println("CC = "+cc);
		System.out.println("NC = "+nc);
		System.out.println("SPC = "+spc);
	}
}
