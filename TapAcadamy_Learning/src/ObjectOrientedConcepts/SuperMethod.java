package ObjectOrientedConcepts;
class DemoClass1{
	int x, y;
	DemoClass1() {
		//super() - it was call Object class super().
		x = 100;
		y = 200;
	}
	DemoClass1(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
class DemoClass2 extends DemoClass1{
	int a, b;
	DemoClass2() {
		this(9, 99); //this() call only for local chaining.
	}
	DemoClass2(int a, int b) {
		//super(); //super() call only for constructor chaining. it is default super(). user provide or not java automatically provide the super(). Constructors first line must have a super method. it was take the control to neighbor or one class only.
		//super(300, 400);
		this.a = a;
		this.b = b;
	}
	void disp() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
	}
}
public class SuperMethod {
	public static void main(String[] args) {
		DemoClass2 d2 = new DemoClass2();
		d2.disp();
	}
}
