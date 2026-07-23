package ObjectOrientedConcepts;

//Inheritance - it is a process of one class acquiring properties and behaviors from another class. Inheritance means code reusability.

//Single Inheritance - Child class derived from one parent class.
class Demo1{
	int a = 10;
	void fun1() {
		System.out.println("Java");
	}
}
class Demo2 extends Demo1{ //extends keyword used for inherit the properties and behaviors from the parent class.
	int b = 20;
	void fun2() {
		System.out.println("Python");
	}
	void display() {
		System.out.println(a);
		System.out.println(b);
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		Demo2 d2 = new Demo2();
		d2.fun1();
		d2.fun2();
		d2.display();
	}
}
