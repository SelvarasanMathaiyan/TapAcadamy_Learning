package String_Program;
import java.util.*;
public class BuiltInMethods {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = "Sachin"; //heap segment --> String Pool --> constant pool --> allow duplicates
		String s2 = "Sachin";	
		String s3 = new String("Sachin"); //heap segment --> String Pool --> non-constant pool --> Don't allow duplicates
		String s4 = new String("Sachin");
		String s5 = "SACHIN";	
		String s6 = "Saurav";
		
		// compare the reference
		System.out.println(s1 == s2); // same reference 
		System.out.println(s1 == s3); // different reference created.
		System.out.println(s3 == s4); // different reference created.
		
		// compare the values
		System.out.println(s1.equals(s2)); // same values
		System.out.println(s1.equals(s5));
		System.out.println(s1.equals(s3)); // same values
		
		// compare the values doesn't consider the case.
		System.out.println(s1.equalsIgnoreCase(s5));
		
		// concat the string
		System.out.println("Java" + "Python"); // create memory the constant pool
		System.out.println(s1 + s2); // create memory on the non constant pool
		System.out.println(s1 + "SpringBoot"); // create memory on the non constant pool
		System.out.println(s1.concat(s2)); // create memory on the non constant pool
		System.out.println(s1.concat("C++")); // create memory on the non constant pool
		System.out.println("RProgram".concat("Java Program")); // create memory on the non constant pool
		/*String r1 = "RProgram".concat("Java Program");
		String r2 = "RProgram".concat("Java Program");
		if(r1 == r2)
			System.out.println("reference are equal");
		else
			System.out.println("reference are unequal");*/
		
		//CompareTo() - Character wise checking.
		System.out.println(s1.compareTo(s6)); // s1 > s6-->c > u-->67 - 85-->-18
		System.out.println(s6.compareTo(s1)); // s6 > s1-->u > c-->85 - 67-->18
		System.out.println(s1.compareTo(s2)); // s1==s2 --> 0
		
		// Some built in methods.
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.indexOf('h'));
		System.out.println(s1.lastIndexOf('n'));
		System.out.println(s1.startsWith("Sa"));
		System.out.println(s1.endsWith("IN"));
		System.out.println(s1.contains("chin"));
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(2, 4));
	}
}
