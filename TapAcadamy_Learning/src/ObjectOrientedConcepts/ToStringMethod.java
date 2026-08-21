package ObjectOrientedConcepts;
import java.util.Arrays;
class Employee{
	//It is automatically JVM is inherited the toString() method in object class. so it was print the classname + @ + hashcode format.
}
class Manager{
	// you need override the toString() method in your own class. you have inherit the method from object class.
	@Override
	public String toString() {
		return "Hi";
	}
}

//toStirng method in Object class
public class ToStringMethod {
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e);
		Manager m = new Manager();
		System.out.println(m);
	}
}

//toString method override in array

//public class ToStringMethod {
//	public static void main(String[] args) {
//		int[] arr = new int[] {10, 20, 30};
//		System.out.println(arr); //it is print the address. because it called the Array class. toString() is inherited in Array class.
//		System.out.println(Arrays.toString(arr)); //it is print the values inside the array. because Arrays class is override the toString() method.
//	}
//}

//toString method override in string

//public class ToStringMethod {
//	public static void main(String[] args) {
//		String str = new String("Java");
//		System.out.println(str); //it is print the output. because String class is override the toString() automatically. so it was show the output.
//	}
//}
