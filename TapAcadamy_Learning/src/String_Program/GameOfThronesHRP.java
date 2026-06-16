package String_Program;
import java.util.*;
public class GameOfThronesHRP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(gameOfThrones(s));
	}

	public static String gameOfThrones(String s) {
		// TODO Auto-generated method stub
		char []ch = s.toCharArray();
		Arrays.sort(ch);
		
		int i = 0, errorCount = 0;
		while(i < ch.length) {
			if(i < ch.length - 1 && ch[i] == ch[i+1]) {
				i = i + 2;
			}
			else {
				i++;
				errorCount++;
			}
		}
		if(errorCount <= 1)
			return "YES";
		else
			return "NO";
	}
}
