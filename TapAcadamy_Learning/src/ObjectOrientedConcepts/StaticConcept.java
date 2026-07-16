package ObjectOrientedConcepts;
class Test{
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
}
class StaticConcept {
	public static void main(String[] args) {
		Test.fun1();
		Test t = new Test();
		t.fun2();
	}
}
