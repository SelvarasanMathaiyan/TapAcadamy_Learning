package String_Program;
import java.util.*;
public class StrBuffer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity()); // default size of memory-->16
		System.out.println("Enter the String: ");
		sb.append(sc.nextLine());
		System.out.println(sb);
		// current_size * 2 + 2
		System.out.println(sb.capacity()); // increased size of memory-->34
		System.out.println(sb.length()); // Length of the text
		sb.trimToSize(); // Trim the remaining memory
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.delete(1, 10);
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
	}
}
