package Multithreading;
import java.util.*;
//Multi-threading can achieve two types: 1. extends Thread class 2. implements Runnable interface
//Thread Scheduler can create the new stack and allocate thread. Thread type class only create for new stacks and thread.
//Advantage of Multi-threading: Efficient utilization of CPU time.
//Steps to achieve multi-threading: 1. Create a class & make it a subclass of Thread. 2. Override run(). 3. indirectly can run() using start().
class Test1 extends Thread{
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Addition process is started");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a + b;
		System.out.println(c);
		System.out.println("Addition process is ended");
	}
}
class Test2 extends Thread{
	@Override
	public void run(){
		System.out.println("Character printing is started");
		for(int i = 65; i <= 75; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Test3 extends Thread{
	@Override
	public void run() {
		System.out.println("Numbers printing is started");
		for(int i = 10; i <= 20; i++) {
			System.out.println(i);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Numbers printing is ended");
	}
}
public class MultithreadingExtendsThread {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		Test3 t3 = new Test3();
		// start() is inherited from the Thread class.
		t1.start();
		t2.start();
		t3.start();
	}
}
