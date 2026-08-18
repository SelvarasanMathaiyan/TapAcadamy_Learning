package ObjectOrientedConcepts;
class Exp{
	static void disp() {
		System.out.println("Static method of Exp class");
	}
}
class Test extends Exp{
	static int a, b;
	static {
		System.out.println("Inside static block");
		a = 10;
		b = 20;
	}
	static void fun1() {
		System.out.println("Inside static method");
	}
	int x, y;
	{
		System.out.println("Inside Instance(Non static) block");
	}
	void fun2() {
		System.out.println("Inside Instance(Non static) method");
	}
	Test(){
		System.out.println("Inside Constructor");
		x = 30;
		y = 40;
	}
	// @Override // Static method cannot be override it. But you are remove the @Override it is accessible. but it is not override. Java is consider inherited method. In these case java has hide the inherited method, only show the child class method only. It is called the METHOD HIDING.
	static void disp() {
		System.out.println("Static method of Test class");
	}
}
class StaticConcept {
	public static void main(String[] args) {
		Test.fun1();
		Test t = new Test();
		t.fun2();
		t.disp(); //Static methods can inherited.
	}
}
