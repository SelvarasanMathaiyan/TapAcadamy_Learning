package Multithreading;

//Thread has two types: 1. User Thread 2. Daemon Thread

//1. User Thread - The JVM is created only for main thread. The programmer create the user thread, it is not automatically terminate the execution by the JVM. 
//In the program infinite loop is there, The JVM doesn't terminate the program. because it is user thread. It is used for foreground tasks.

//2. Daemon Thread - Daemon Thread is also a thread. It is created by user. but it is not a user thread.  Any thread can created in java setDaemon(false) is default. using setDaemon(true) method, it is JVM consider daemon thread.
//Daemon Thread can continue the execution within program any User Thread is present and executed. If all User Thread is complete the execution, the JVM automatically terminate the daemon thread. It is life cycle depends on the User Thread. It is used for background tasks.

class Demos1 extends Thread{
	public void run() {
		System.out.println("User thread started execution");
		for (int i = 1; i <= 5 ; i++) {
			System.out.println("User thread is executing...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("User thread finished execution");
	}
}
class Demos2 extends Thread{
	public void run() {
		System.out.println("Daemon thread started execution");
		for ( ; ; ) {
			System.out.println("Daemon thread is executing...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//System.out.println("User thread finished execution");
	}
}
public class TypesOfThread {
	public static void main(String[] args) {
		System.out.println("Main thread started execution");
		Demos1 t1 = new Demos1();
		t1.start();
		
		Demos2 t2 = new Demos2();
		t2.setDaemon(true);
		t2.start();
		System.out.println("Main thread finished execution");
	}
}
