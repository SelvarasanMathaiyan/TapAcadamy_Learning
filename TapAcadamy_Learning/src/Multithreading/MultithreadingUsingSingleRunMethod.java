package Multithreading;
import java.util.*;
//Using Threads handled in single run() with in class. 
class Demo1 extends Thread{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String str = t.getName();
		if(str.equals("ADD")) {
			addition();
		}
		else if(str.equals("CHAR")) {
			printChar();
		}
		else {
			printNum();
		}
	}
	public void addition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Addition process is started");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a + b;
		System.out.println(c);
		System.out.println("Addition process is ended");
	}
	public void printChar() {
		System.out.println("Printing Characters is started");
		for(int i = 65; i <= 75; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing Characters is ended");
	}
	public void printNum() {
		System.out.println("Printing Numbers is started");
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing Numbers is ended");
	}
}
public class MultithreadingUsingSingleRunMethod {
	public static void main(String[] args) {
		Demo1 t1 = new Demo1();
		Demo1 t2 = new Demo1();
		Demo1 t3 = new Demo1();
		t1.setName("ADD");
		t2.setName("CHAR");
		t3.setName("NUM");
		t1.start();
		t2.start();
		t3.start();
	}
}
