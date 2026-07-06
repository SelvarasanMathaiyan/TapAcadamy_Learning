// In one Class, multiple methods has same method name, but different parameters is called the method overloading.
package ObjectOrientedConcepts;
import java.util.*;
class Customer{
	char gender;
	String city;
	int cId;
	Long mobile;
	void setDetails(char g) {
		gender = g;
	}
	void setDetails(String c) {
		city = c;
	}
	void setDetails(int i) {
		cId = i;
	}
	void setDetails(Long m) {
		mobile = m;
	}
}
// method overloading follows the
class Calculator{
//	int add(int a, int b) {
//		System.out.println("1");
//		return a + b;
//	}
//	float add(int a, float b) {
//		System.out.println("2");
//		return a + b;
//	}
//	double add(float a, double b) {
//		System.out.println("3");
//		return a + b;
//	}
//	double add(double a, double b) {
//		System.out.println("4");
//		return a + b;
//	}
//	double add(double a, float b) {
//		System.out.println("5");
//		return a + b;
//	}
	double add(int a, double b) {
		System.out.println("6");
		return a + b;
	}
	double add(double a, int b) {
		System.out.println("7");
		return a + b;
	}
}
public class MethodOverloading {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Customer c1 = new Customer();
//		c1.gender = 'M';
//		c1.city = "Bangalore";
//		c1.cId = 1234;
//		c1.mobile = 984374697L;
//		System.out.println(c1.gender);
//		System.out.println(c1.city);
//		System.out.println(c1.cId);
//		System.out.println(c1.mobile);
//		c1.setDetails(sc.nextLine().charAt(0));
//		c1.setDetails(sc.nextLine());
//		c1.setDetails(sc.nextInt());
//		c1.setDetails(sc.nextLong());
//		System.out.println(c1.gender);
//		System.out.println(c1.city);
//		System.out.println(c1.cId);
//		System.out.println(c1.mobile);
		
		Calculator c2 = new Calculator();
		System.out.println(c2.add(10, 20.2));
	}
}
