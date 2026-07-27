package ObjectOrientedConcepts;
final class Monkey1{ //doesn't inherit the final class
	
}
class Monkey2 /*extends Monkey1*/ {
	final int no = 20;
	void jump() {
		//no = 100; //final variable doesn't change it.
		System.out.println("No of monkey is "+no); //final variable can use it. but can't be changed.
	}
	final void eat() {
		System.out.println("Eat 10 bananas");
	}
}
class Monkey3 extends Monkey2{
	// void eat(){	} // final method doesn't override it.
}
public class FinalKeyword {
	public static void main(String[] args) {
		Monkey3 m = new Monkey3();
		m.eat(); //final method can inherited.
		m.jump();
	}
}
