package Multithreading;
// Synchronization is a locking system in java. It is achieved with the synchronized keyword wherein only one thread can access the resources(method) at any point of time.
// Synchronized keyword can be used in, 1. methods 2. blocks


class BathRoom{
	//synchronized keyword used in method.
//	synchronized void bathRoom()
//	{
//		try {
//			System.out.println(Thread.currentThread().getName()+" entered the bathroom.");
//			Thread.sleep(3000);
//			System.out.println(Thread.currentThread().getName()+" is using the bathroom");
//			Thread.sleep(3000);
//			System.out.println(Thread.currentThread().getName()+" exited from the bathroom.");	
//			Thread.sleep(3000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}	
//	}
	void bathRoom()
	{
		try {
			System.out.println(Thread.currentThread().getName()+ " is executing 1 statement");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+ " is executing 2 statement");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+ " is executing 3 statement");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+ " is executing 4 statement");
			Thread.sleep(2000);
			synchronized(this) {
			System.out.println(Thread.currentThread().getName()+ " is executing 5 statement");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+ " is executing 6 statement");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+ " is executing 7 statement");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+ " is executing 8 statement");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
class Boy extends Thread{
	BathRoom bathroom;
	public Boy(BathRoom bathroom) {
		this.bathroom = bathroom;
	}
	
	@Override
	public void run() {
		bathroom.bathRoom();
	}
}
class Girl extends Thread{
	BathRoom bathroom;
	public Girl(BathRoom bathroom) {
		this.bathroom = bathroom;
	}
	
	@Override
	public void run() {
		bathroom.bathRoom();
	}
}
class Others extends Thread{
	BathRoom bathroom;
	public Others(BathRoom bathroom) {
		this.bathroom = bathroom;
	}
	
	@Override
	public void run() {
		bathroom.bathRoom();
	}
}
public class Synchronization {
	public static void main(String[] args) {
		BathRoom bathroom = new BathRoom();
		
		Boy boy = new Boy(bathroom);
		Girl girl = new Girl(bathroom);
		Others others = new Others(bathroom);
		
		boy.setName("Boy");
		girl.setName("Girl");
		others.setName("Others");
		
		boy.start();
		girl.start();
		others.start();
		
		/* try {
			boy.start();
			boy.join();
			girl.start();
			girl.join();
			others.start();
			others.join();
		} catch (Exception e) {
			e.printStackTrace();
		} */
		
		//There two types works as same. but synchronized is a best approach. Because using join method, we have control the thread scheduler. It is not independently works. Thread Scheduler is decide which thread is execute first.
	}
}
