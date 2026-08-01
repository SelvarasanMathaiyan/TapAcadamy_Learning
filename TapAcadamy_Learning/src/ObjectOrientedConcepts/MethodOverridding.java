package ObjectOrientedConcepts;
// Method overriding is a process of child class inheriting method from parent class method. It can be modified or changing its behaviors and used it.
class Testing1{
	void fun1() { //default method
		System.out.println("Parent Class Method");
	}
	void fun2() {
		
	}
}
public class MethodOverridding extends Testing1{
//	private void fun1() {} // RULE1: Child class methods access specifiers are same and increase only accessible. Otherwise not accessible.
//	void fun1() {};
	public void fun1() {
		System.out.println("Child Class Overridden Method");
	}
//	int fun2() { // RULE2: Child class methods return type same for parent class method. If it is changed not accessible.
//		return 0;
//	}
}

// RULE3: When the child class method overrides the parent class method, then the child class return the parent class object. It is called the covariant type.
class Planes{
	
}
class CargoPlanes extends Planes{
	
}

class Testing2{
	Planes fun1() {
		System.out.println("Parent Class Method");
		Planes p = new Planes();
		return p;
	}
}

class Testing3 extends Testing2{
	CargoPlanes fun1() {
		System.out.println("Child Class Overridden Method");
		CargoPlanes cp = new CargoPlanes();
		return cp;
	}
}

