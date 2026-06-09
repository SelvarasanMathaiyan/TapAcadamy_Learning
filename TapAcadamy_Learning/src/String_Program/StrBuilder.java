package String_Program;
import java.util.*;
public class StrBuilder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		// Same as StringBuffer and all method are same. but It is thread safe and support multithreading. StringBuffer not thread safe and not support multithreading.  
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
