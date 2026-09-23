package ExceptionHandling;
import java.util.*;
//Propagation means movement of exception (in multiple class).
 
/* Stack trace (or) Stack hierarchy */

//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at ExceptionHandling.Demo3.fun1(PropagationOfAnException.java:12)
//at ExceptionHandling.Demo2.fun2(PropagationOfAnException.java:21)
//at ExceptionHandling.Demo1.fun3(PropagationOfAnException.java:29)
//at ExceptionHandling.PropagationOfAnException.main(PropagationOfAnException.java:37)

//In this case the top of the hierarchy is exception occurred, the exception object was created. It was hand over to the runtime system, RTS finds within the same method any user defined exception handler was there. but no one has found. but the RTS doesn't directly provide to the default exception handler. it is check the stack hierarchy, it means check the method caller (or) below the hierarchy. All below hierarchy not found any user defined exception, it is hand over to the default exception handler(Abrupt termination). The called method doesn't have the UDEH, but caller method is have UDEH. It is handle the exception all remaining statements are smoothly terminated. It is Propagation of exception / Stack trace / Stack hierarchy.

class Demo3{
	void fun1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Connection 3 is established.");
		System.out.println("Enter the Numberator: ");
		int a = sc.nextInt();
		System.out.println("Enter the Denominator: ");
		int b = sc.nextInt();
		int c = a/b;
		System.out.println(c);
		System.out.println("Connection 3 is terminated.");
	}
}
class Demo2{
	void fun2() {
		System.out.println("Connection 2 is established.");
		Demo3 d3 = new Demo3();
		try {
			d3.fun1();
		} catch (Exception e) {
			System.out.println("Exception is handled in fun2()");
		}
		System.out.println("Connection 2 is terminated.");
	}
}
class Demo1{
	void fun3() {
		System.out.println("Connection 1 is established.");
		Demo2 d2 = new Demo2();
		d2.fun2();
		System.out.println("Connection 1 is terminated.");
	}
}
public class PropagationOfAnException {
	public static void main(String[] args) {
		System.out.println("Server is established.");
		Demo1 d1 = new Demo1();
		d1.fun3();
		System.out.println("Server is terminated.");
	}
}
