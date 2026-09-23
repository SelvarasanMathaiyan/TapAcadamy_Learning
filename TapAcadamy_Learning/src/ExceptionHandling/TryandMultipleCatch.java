package ExceptionHandling;
import java.util.*;

//Exception -  When the exception is occurred during the execution of program (or) runtime of the program. Exception is happened for due to faulty inputs provide to the program by the user.

//Exception handling types is two: 1. Default exception handler 2. User defined exception handler.

//When ever exception was occurred in the method at the time java create exception object. this exception object is hand over to the RTS (Run Time System). this RTS finds the inside method any user defined exception handler is there. which is try and catch in program then exception object handled with in the program. but if the programmer was not provide any user defined exception handler, then the RTS finds the default exception handler.

//Default exception handler is abrupt termination was happened. abrupt termination result is loss of data. so the user defined exception handler is prevented the abrupt termination and successfully ensure the normal termination.

public class TryandMultipleCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Connection is Estd");
		
		//Single try and multiple catch.
		try {
			System.out.println("Enter the numerator: ");
			int a = sc.nextInt();
			System.out.println("Enter the denominator: ");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println(c);
			
			System.out.println("Enter the array size: ");
			int size = sc.nextInt();
			int arr[] = new int[size];
			System.out.println("Enter the element: ");
			int ele = sc.nextInt();
			System.out.println("Enter the position to be stored in: ");
			int index = sc.nextInt();
			arr[index] = ele;
			System.out.println(arr[index]);
		}
		
		catch(ArithmeticException ae) { 
			System.out.println("Provide non zero denominator");
		}
		catch(NegativeArraySizeException nas) {
			System.out.println("Provide positive array size");
		}
		catch(InputMismatchException im){
			System.out.println("Provide interger value");
		}
		catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println("Provide valid index");
		}
		catch(Exception e) { //It is generic catch block. It is catches all types of Exception. Disadv: You will not get a suitable message for the exception, get only same types of message.
			System.out.println("Invalid input");
		}
		
		System.out.println("Connection is terminated");
	}
}
