package Multithreading;
//Multi-threading can have see in two perspective,
//1. Stack Perspective (memory perspective)
//2. State Perspective
//state: new(start)-->runnable-->running(sleep, resource unavailable, wait)-->dead.
//If you want interrupt in any state is possible. using interrupt(). interrupt means kills the thread. it will go to dead state or directly finished execution.
public class PerspectiveOfThreadsandInterruptMethod {
	public static void main(String[] args) {
		System.out.println("Main thread started execution");
		try {
			System.out.println("Main thread executing...");
			Thread.sleep(2000);
			System.out.println("Main thread executing...");
			Thread.sleep(2000);
			System.out.println("Main thread executing...");
			Thread.currentThread().interrupt();
			Thread.sleep(2000);
			System.out.println("Main thread executing...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main thread finished execution");
	}
}
