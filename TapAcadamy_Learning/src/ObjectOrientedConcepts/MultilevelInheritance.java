package ObjectOrientedConcepts;

//Multilevel Inheritance - Child class derived from Two or more parent class.
class Dem1{
	private int a = 10;
	void fun1() {
		System.out.println("Java");
	}
}
class Dem2 extends Dem1{ 
	int b = 20;
	void fun2() {
		System.out.println("Python");
	}
}
class Dem3 extends Dem2{ 
	int c = 30;
	void fun3() {
		System.out.println("JavaScript");
	}
}
class Dem4 extends Dem3{ 
	void display() {
		//System.out.println(a); //it is not visible. Because it was used private. 
		//Access modifiers - private - not participated inheritance. public, protected, default - participated inheritance.
		System.out.println(b);
		System.out.println(c);
	}
}
public class MultilevelInheritance {
	public static void main(String[] args) {
		Dem4 d4 = new Dem4();
		d4.fun1();
		d4.fun2();
		d4.fun3();
		d4.display();
	}
}

