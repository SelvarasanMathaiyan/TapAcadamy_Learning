package ObjectOrientedConcepts;
class Calculator1{
	void math() {
		System.out.println("It is inside Calculator1 class");
	}
}
interface Calculator2{
	int count =3; // Rule 10: An interface contain constant variable and method signatures. A variable with an interface is automatically java provide the public static final int count = 3;
	void add();
	void sub();
}

interface Calculator3{
	void mul();
}

//interface Calculator4 implements Calculator2{ } // Rule 7: An interface cannot implements another interface, because interface cannot provide methods with bodies inside it.

interface Calculator4 extends Calculator2, Calculator3{ // Rule 8: An interface can extends another interface, not only this it can inherit from multiple interface. because diamond shape problem doesn't exist. Multiple inheritance in java can be indirectly achieved by making use of interface.
	void div();
}

class  Calculator5 extends Calculator1 implements Calculator3{ //Rule 9: A class can both extend another class as well as implements an interfaces. order should be extends first implements later.
	public void mul() {
		System.out.println("Inside mul method with MyCalc4 class");
	}
}

abstract class MyCalc1 implements Calculator2{ // Rule 5: If a class partially implements interface, it must declare itself as abstract.
	public void add() {
		System.out.println("Inside add method with MyCalc1 class");
	}
}

class MyCalc2 implements Calculator2, Calculator3{ //Rule 6: A class can implements multiple interfaces because diamond shape problem does not exist as interface will not have parent (parent means interface cannot connect to object class)
	public void add() {
		System.out.println("Inside add method with MyCalc2 class");
	}
	public void sub() {
		System.out.println("Inside sub method with MyCalc2 class");
	}
	public void mul() {
		System.out.println("Inside mul method with MyCalc2 class");
	}
}

class MyCalc3  implements Calculator4{
	public void add() {
		System.out.println("Inside add method with MyCalc3 class");
	}
	public void sub() {
		System.out.println("Inside sub method with MyCalc3 class");
	}
	public void mul() {
		System.out.println("Inside mul method with MyCalc3 class");
	}
	public void div() {
		System.out.println("Inside mul method with MyCalc3 class");
	}
	
	public void fun() {
		System.out.println(count);
//		count = 2; // change the values because it is final variable.
	}
}

public class InterfaceConcepts2 {
	public static void main(String[] args) {
//		MyCalc1 mc1 = new MyCalc1(); // It is abstract class. It is incomplete. so cannot create object.
		MyCalc2 mc2 = new MyCalc2();
		MyCalc3 mc3 = new MyCalc3();
		
		mc2.add();
		mc2.sub();
		mc2.mul();
		System.out.println(mc2.count);
		
		mc3.add();
		mc3.sub();
		mc3.mul();
		mc3.div();
		mc3.fun();
	}
}
