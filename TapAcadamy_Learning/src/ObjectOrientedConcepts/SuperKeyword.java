package ObjectOrientedConcepts; 
// super keyword used for access the parent class variables in the child class.
class Exp1{
	int i = 10;
	void view() {
		System.out.println("Hello");
	}
}
class Exp2 extends Exp1{
	int i = 100;
	void disp() {
		System.out.println(i); // When the name clash occurred the local variable is first preference. so 10 is printed.
		System.out.println(super.i); // it is call the parent class i. so print 100;
	}
	
	@Override
	void view() {
		System.out.println("Hi");
		super.view(); //super keyword used in methods call the super method.
	}
}
public class SuperKeyword {
	public static void main(String[] args) {
		Exp2 e = new Exp2();
		e.disp();
		e.view();
	}
}
