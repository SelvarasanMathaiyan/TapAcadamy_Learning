package Multithreading;
import java.util.*;
//Runnable interface is `better approach` for achieve the multi-threading. Because a class cannot extends thread and exception, diamond shape problem was occurred. but using interface implements interface as well as extends exception is possible.
//Runnable Interface is only have run() signature statement only. not have the start(). start() method is own for Thread class. Runnable interface doesn't create the thread and new stack. Using parent reference to child object. It is helps to the multi-threading.
class Testing1 implements Runnable{
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
class Testing2 implements Runnable{
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
class Testing3 implements Runnable{
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
public class MultithreadingImplementsRunnableInterface {
	public static void main(String[] args) {
		Testing1 t1 = new Testing1();
		Testing2 t2 = new Testing2();
		Testing3 t3 = new Testing3();
		//Create object for Thread class and pass the reference to the constructor.
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		Thread th3 = new Thread(t3);
		
		th1.start();
		th2.start();
		th3.start();
	}
}
