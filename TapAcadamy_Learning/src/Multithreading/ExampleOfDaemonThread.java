package Multithreading;
//Step to create daemon thread --> 
//1. Identify primary thread.
//2. Primary thread should create the daemon thread.
//3. Primary thread should use setDaemon() to make daemon thread as helper threads.
class Captain extends Thread{ // Primary Thread
	@Override
	public void run() {
		BattingCoach abishek = new BattingCoach(); 
		BowlingCoach morne = new BowlingCoach(); 
		abishek.setDaemon(true);
		morne.setDaemon(true);
		abishek.start();
		morne.start();
		try {
			System.out.println("Captain has entered the ground");
			Thread.sleep(3000);
			System.out.println("Captain will do warm-up");
			Thread.sleep(3000);
			System.out.println("Captain will do fielding practice");
			Thread.sleep(3000);
			System.out.println("Captain will do bowling practice");
			Thread.sleep(3000);
			System.out.println("Captain will do batting practice");
			Thread.sleep(3000);
			System.out.println("Captain will go to the hotel");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class BattingCoach extends Thread{ //Daemon Thread
	@Override
	public void run() {
		for( ; ; ) {
			try {
				System.out.println("Batting coach is in the ground supporting captain");
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class BowlingCoach extends Thread{ //Daemon Thread
	@Override
	public void run() {
		for( ; ; ) {
			try {
				System.out.println("Bowling coach is in the ground supporting captain");
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class ExampleOfDaemonThread {
	public static void main(String[] args) {
		Captain rohit = new Captain();
		rohit.start();
	}
}
