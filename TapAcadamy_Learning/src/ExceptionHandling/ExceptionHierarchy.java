package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

//Java is two types of mistakes, 1. Error 2. Exception

//Error has two types 1. Compile time error (ex: Syntax error) 2. Run time error (ex: StackOverFlowError, OutOfMemoryError)

//Compile time error is occurred for faulty coding. but run time error means program was compiled with no error. but run time it has throw the error

// Example1 of Runtime error:
//class Exmp1{
//	//It is infinite recursion. It doesn't handle the user defined exception(try-catch). Because it is run time error.
//	void fun() {
//		try {
//			fun();
//		} catch (Exception e) {
//			System.out.println("Exception handled in fun1");
//		}
//		//same error was occurred. Because it is error not a exception.
//	}
//}
//
//public class ExceptionHierarchy {
//	public static void main(String[] args) {
//		Exmp1 e = new Exmp1();
//		e.fun();
//	}
//}

//Example2 of Runtime error:
//public class ExceptionHierarchy {
//	public static void main(String[] args) {
//
//		int arr[] = new int[Integer.MAX_VALUE]; //No syntax error, but runtime error was occurred.
//	}
//}

//Exception is only happened for during the run time.

//Exception has two types: 1. Runtime Exception (or) Unchecked Exception (ex: ArithmeticException, NegativeArraySizeException, InputMismatchException, ArrayIndexOutOfBoundException, etc..) 2. IOException (or) Checked Exception (ex: FileNotFoundException, SocketException, SQLException)

//Unchecked Exception is not checked by the compiler at compile time. It occurs only runtime.

//public class ExceptionHierarchy{
//	public static void main(String[] args) {
//		int a = 100;
//		int b = 0;
//		int c = a/b;
//		System.out.println(c);
//	}
//}

//Checked Exception is checked by the compiler at compile time.

public class ExceptionHierarchy{
	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("");
		} catch (FileNotFoundException e) {
			System.out.println("Exception handled");
		}
	} //Without try and catch it shows error. because it is error statement. so compiler not allowed the execution.
}
