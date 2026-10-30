package Multithreading;
// Daemon thread is can be used supporting task. User thread is used for main task. with in the program user thread is present and finished its execution, JVM automatically terminate the execution of Daemon thread.
class Eclipse extends Thread{
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		if(name.equals("TYPE")) {
			codeType();
		}
		else if(name.equals("COMPLETE")) {
			codeComplete();
		}
		else {
			codeSave();
		}
	}
	public void codeType() {
		System.out.println("Typing started");
		for(int i = 0 ;i < 5; i++) {
			System.out.println("Typing...");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Typing finished");
	}
	public void codeComplete() {
		System.out.println("Autocomplete started");
		for( ; ; ) {
			System.out.println("Autocompleting...");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void codeSave() {
		System.out.println("Autosave started");
		for( ; ; ) {
			System.out.println("Autosaving...");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class UseOfDaemonThread {
	public static void main(String[] args) {
		Eclipse t1 = new Eclipse();
		Eclipse t2 = new Eclipse();
		Eclipse t3 = new Eclipse();
		
		t1.setName("TYPE");
		t2.setName("COMPLETE");
		t2.setDaemon(true);
		t3.setName("SAVE");
		t3.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
