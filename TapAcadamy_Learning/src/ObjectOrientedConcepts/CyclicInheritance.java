package ObjectOrientedConcepts;
//Cyclic Inheritance - not support for java. Because which one is parent class and child class doesn't identified. so it is not supported in java.
class Temp1 extends Temp2{
	void fun1() {
		System.out.println("Java");
	}
} 
class Temp2 extends Temp1{
	void fun2() {
		System.out.println("Python");
	}
}
public class CyclicInheritance {
	public static void main(String[] args) {
		Temp2 t2 = new Temp2();
		t2.fun1();
		t2.fun2();
	}
}
