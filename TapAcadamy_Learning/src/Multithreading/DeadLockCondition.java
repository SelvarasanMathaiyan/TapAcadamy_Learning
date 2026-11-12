package Multithreading;
//When multiple threads are in block state inter depending on each other this condition we tell it as dead lock condition.
class Warriors extends Thread{
	String res1 = "Bramastra";
	String res2 = "Pashupatastra";
	String res3 = "Sarpastra";
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("Arjuna"))
			arjuna();
		else
			karuna();
	}
	public void arjuna() {
		try {
			synchronized (res1) {
				Thread.sleep(5000);
				System.out.println("Arjuna is acquiring " + res1);
				synchronized (res2) {
					Thread.sleep(5000);
					System.out.println("Arjuna is acquiring " + res2);
					synchronized (res3) {
						Thread.sleep(5000);
						System.out.println("Arjuna is acquiring " + res3);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void karuna() {
	//This below statements is working perfectly. It is not occur deadlock. Thread Scheduler decides which thread is execute first.
		
	/*	try {
			synchronized (res1) {
				Thread.sleep(5000);
				System.out.println("Karuna is acquiring " + res1);
				synchronized (res2) {
					Thread.sleep(5000);
					System.out.println("Karuna is acquiring " + res2);
					synchronized (res1) {
						Thread.sleep(5000);
						System.out.println("Karuna is acquiring " + res3);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 	*/
		
		
		// The process is not terminated or dead state. Because it is in the block state.
		try {
		synchronized (res3) {
			Thread.sleep(5000);
			System.out.println("Karuna is acquiring " + res3);
			synchronized (res2) {
				Thread.sleep(5000);
				System.out.println("Karuna is acquiring " + res2);
				synchronized (res1) {
					Thread.sleep(5000);
					System.out.println("Karuna is acquiring " + res1);
				}
			}
		}
	} catch (Exception e) {
		e.printStackTrace();
	} 	
	}
}
public class DeadLockCondition {
	public static void main(String[] args) {
		Warriors w1 = new Warriors();
		Warriors w2 = new Warriors();
		
		w1.setName("Arjuna");
		w2.setName("Karuna");
		
		w1.start();
		w2.start();
	}
}
