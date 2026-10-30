package Multithreading;
//join() - One thread waits for another thread to complete its execution. After that, the waiting thread continues its own execution.
class Example extends Thread{
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
		System.out.println("Character printing is ended");
	}
}
public class JoinMethod {
	public static void main(String[] args) {
		System.out.println("Main thread started execution");
		Example t = new Example();
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main thread finished execution");
	}
}
