package ObjectOrientedConcepts;
//Functional Interface contains one abstract methods. but it is allowed default, static and private methods.
//Functional Interface can be implemented for, i. Normal class ii. Inner class iii. Anonymous inner class iv. Lambda expression
//@FunctionalInterface
interface Shows {
	void disp(); 
	default void display1() {
		
	}
	static void display2() {
		
	}
	private void display3() {
		
	}
}
 
//1.Normal Class - This is normal class implemented the functional interface.

/* class Demo implements Shows{ 
	public void disp() {
		System.out.println("Hello");
	}
} */

public class FunctionalInterfaceAndLambda{
	
	//2.(i) it is member inner class - it is static can access the main() is directly. but it is non static create the object for outer class and using reference name for create the object of inner class ex: FunctionalInterfaceClass fl = new FunctionalInterfaceClass(); --> Demo d = fl.new Demo();
	
	/* static class Demo implements Shows{
	  @Override
		  public void disp() {
		  		System.out.println("Hello"); 
		  } 
	   } */
	
	public static void main(String[] args) {
		
	//2.(ii) in is local inner class - it is directly access for our own object
		
	/* class Demo implements Shows{
			public void disp() {
				System.out.println("Hello");
			}
		} 
		Shows s = new Demo();
		s.disp(); */
		
	//3. Anonymous inner class - Anonymous means no name. Below the statement not a object creation of Shows because it is interface. so object was created. it is empty object using parent ref (interface) implements the interface(Shows).
		
		/* Shows s = new Shows()
		{
			public void disp() {
				System.out.println("Hello");
			}
		};
		s.disp(); */
		
	//4. Lambda Expression - Above all are working for normal interface. It is only works on functional interface. Syntax - ()->{ }; it is introduced in Java-8. It is used for java security and code size reduction.
		
//		Shows s = ()->{System.out.println("Lambda"); };
//		s.disp();
		
	}
}