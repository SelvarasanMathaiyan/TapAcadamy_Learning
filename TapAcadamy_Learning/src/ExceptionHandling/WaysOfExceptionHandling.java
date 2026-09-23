package ExceptionHandling;
import java.util.*;

// Different ways of exception handling, 
	// 1. Handling the Exception(try, catch) 
	// 2. Re-throwing the Exception(try, catch, throw, throws, finally)
	// 3. Ducking the Exception(throws)

// 1. Handling the Exception(try, catch) - It means when the method is occurred the exception, that same method is catch and handle the exception.

class Demos1{
	void fun1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Connection 1 is established.");
		try {
			System.out.println("Enter the Numerator: ");
			int a = sc.nextInt();
			System.out.println("Enter the Denominator: ");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("Exception is handled in fun1");
		}
		System.out.println("Connection 1 is terminated.");
	}
}

// 2. Re-throwing the Exception - Java is automatically throw the exception stack hierarchy wise. but we are again throw the exception object which method is called the current method. It is called Re-throwing.

	//throw - It means when the method is occurred the exception, that method is handle the exception object. but the caller method is doesn't know exception is occurred or not. so it is throw the exception object to the caller method. It is handle the exception for below the hierarchy.
	
	//finally - It means you are throw the exception to the caller method. but the current method remaining statement is not executed. so using finally block inside statement was compulsory it is executed.
	
	//throws - It is placed in signature of the method. It is warning the caller method, this type of exception is occurred in the method. so you are ready to prevent the exception is mandatory.

class Demos2{
	void fun2() throws ArithmeticException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Connection 2 is established.");
		try {
			System.out.println("Enter the Numerator: ");
			int a = sc.nextInt();
			System.out.println("Enter the Denominator: ");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("Exception is handled in fun2");
			throw e;
		}
		finally {
			System.out.println("Connection 2 is terminated.");
		}
	}
}

// 3. Ducking the Exception - It means the top of hierarchy or called method is doesn't handle the exception. it is only warning the caller method (or) below the hierarchy. Caller method is handle the exception is mandatory.

class Demos3{
	void fun3() throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Connection 3 is established.");
		System.out.println("Enter the Numerator: ");
		int a = sc.nextInt();
		System.out.println("Enter the Denominator: ");
		int b = sc.nextInt();
		int c = a/b;
		System.out.println(c);
		System.out.println("Connection 3 is terminated.");
	}
}

public class WaysOfExceptionHandling {
	public static void main(String[] args)  {
		System.out.println("Server is established");
		
//		Demos1 d2 = new Demos1();
//		d2.fun1();
		
//		Demos2 d2 = new Demos2();
//		try {
//			d2.fun2();
//		} 
//		catch (ArithmeticException ae) {
//			System.out.println("provide valid value");
//		}
//		catch (Exception e) {
//			System.out.println("Exception is handled in main()");
//		}
		
		Demos3 d3 = new Demos3();
		try {
			d3.fun3();
		} catch (Exception e) {
			System.out.println("Exception is handled in main()");
		}
		System.out.println("Server is terminated");
	}
}
