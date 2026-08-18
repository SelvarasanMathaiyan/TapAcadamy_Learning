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
//	private void fun1() {} // RULE 1: Child class overridden methods can derived from parent class method access modifiers should be same and increase the access modifiers is accessible. But cannot reduce it.
//	void fun1() {};
	public void fun1() {
		System.out.println("Child Class Overridden Method");
	}
//	int fun2() { // RULE 2: Child class overridden methods and parent class methods are primitive return type is there cannot change return type.
//		return 0;
//	}
	
//	@Override
//	void fun2(int a, int b) { // RULE 4: When you are overriding, you cannot change the number of parameters and type of parameters. But you are remove the @Override it is accessible. The java is consider it is specialized method. so the inherited method is there and specialized method is there within class. So in this case method overloading is enabled. finally find the which one is method is called.
//		
//	}
}

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
	CargoPlanes fun1() { // RULE 3: But not a primitive types is there, Objects is there. it is changed the return type. but the existing return type is IS-A relationship mandatory. (Existing return types between in the IS-A relationship, it is called co-varient return type).
		
		System.out.println("Child Class Overridden Method");
		CargoPlanes cp = new CargoPlanes();
		return cp;
	}
}

