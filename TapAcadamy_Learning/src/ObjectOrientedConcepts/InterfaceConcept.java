package ObjectOrientedConcepts;
import java.util.*;
//Interface - Interface is achieved the standardization issue. Interface class is contain collection of abstract method. implements keyword is used to child class implementing the interface class.
interface CalculatorProgram{
	public void add(); //Rule1: one interface can have multiple implements
	public void sub(); 
}

class MyCalculator1 implements CalculatorProgram{
	
	int x = 100;
	int y = 200;
	
	@Override
	public void add() {
		System.out.println(x+y);
	}

	@Override
	public void sub() {
		System.out.println(x-y);
	}
	
}

class MyCalculator2 implements CalculatorProgram{
	
	Scanner sc = new Scanner(System.in);
	int x, y;
	
	@Override
	public void add() {
		System.out.println("Enter the first number: ");
		x = sc.nextInt();
		
		System.out.println("Enter the  second number: ");
		y = sc.nextInt();
		
		System.out.println(x+y);
	}

	@Override
	public void sub() {
		System.out.println("Enter the first number: ");
		x = sc.nextInt();
		
		System.out.println("Enter the  second number: ");
		y = sc.nextInt();
		
		System.out.println(x-y);
	}
	
}

class MyCalculator3 implements CalculatorProgram{
	Scanner sc = new Scanner(System.in);
	int x, y;
	
	@Override
	public void add() {
		System.out.println("Enter the first number: ");
		x = sc.nextInt();
		
		System.out.println("Enter the  second number: ");
		y = sc.nextInt();
		
		if(x == 0) 
		System.out.println("First number is 0 not valid");
		else
		System.out.println(x+y);
	}

	@Override
	public void sub() {
		System.out.println("Enter the first number: ");
		x = sc.nextInt();
		
		System.out.println("Enter the  second number: ");
		y = sc.nextInt();
		
		if(x == 0) 
		System.out.println("First number is 0 not valid");
		else
		System.out.println(x-y);
	}
}

class Math{
	static void permit(CalculatorProgram ref){ //Rule2: Interface can promote polymorphism. Because an interface type ref can point to the implementing class objects and through it we can access the implemented methods.
		ref.add();
		ref.sub();
	}
}
public class InterfaceConcept {
	public static void main(String[] args) {
		MyCalculator1 mc1 = new MyCalculator1();
		MyCalculator2 mc2 = new MyCalculator2();
		MyCalculator3 mc3 = new MyCalculator3();
		
		Math.permit(mc1); 
		Math.permit(mc2);
		Math.permit(mc3);
	}
}
