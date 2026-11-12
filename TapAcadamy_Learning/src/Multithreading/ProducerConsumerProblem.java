package Multithreading;

// notify() and wait() - method is only working for synchronized environment. These method are working without object creation and it is not static method. because Queue class is already defined in java and it is inherited from Object. Object class is own for notify() and wait() methods.

class Queue{
	private int data;
	boolean valueIsPresent = false;
	synchronized public void setData(int data) {
		if(valueIsPresent == false) {
			this.data = data;
			System.out.println("Producer produced value is " + data);
			valueIsPresent = true;
			notify();
		}
		else {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	synchronized public void getData() {
		if(valueIsPresent == true) {
			System.out.println("Consumer consumed value is " + data);
			valueIsPresent = false;
			notify();
		}
		else {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
class Producer extends Thread{
	Queue q;
	public Producer(Queue q) {
		this.q = q;
	}
	@Override
	public void run() {
		int i = 1;
		for(; ;) {
			q.setData(i++);
		}
	}
}
class Consumer extends Thread{
	Queue q;
	public Consumer(Queue q) {
		this.q = q;
	}
	@Override
	public void run() {
		for(; ;) {
			q.getData();
		}
	}
}
public class ProducerConsumerProblem {
	public static void main(String[] args) {
		Queue q = new Queue();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		
		p.setName("Producer");
		c.setName("Consumer");
		
		p.start();
		c.start();
	}
}
