package String_Program;
import java.util.*;
public class CountCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String chr = sc.next();
		System.out.println(countCharacters(str, chr));
	}

	public static int countCharacters(String str, String chr) {
		// TODO Auto-generated method stub
		int key = chr.charAt(0);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == key) {
				count++;
			}
		}
		return count;
	}
}
