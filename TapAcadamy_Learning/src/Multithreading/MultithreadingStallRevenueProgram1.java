package Multithreading;
import java.util.*;
class Stalls implements Runnable{
	private String stallName;
	private String details;
	private double stallArea;
	private String owner;
	private double stallCost;
	
	public Stalls(String stallName, String details, double stallArea, String owner) {
		this.stallName = stallName;
		this.details = details;
		this.stallArea = stallArea;
		this.owner = owner;
	}
	public String getStallName() {
		return stallName;
	}
	public String getDetails() {
		return details;
	}
	public double getStallArea() {
		return stallArea;
	}
	public String getOwner() {
		return owner;
	}
	public double getStallCost() {
		return stallCost;
	}
	
	@Override
	public void run() {
		stallCost = stallArea * 150;
	}
	
}
public class MultithreadingStallRevenueProgram1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of stalls: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Stalls[] stall = new Stalls[n];
		
		for(int i = 0; i < n; i++) {
			String str = sc.nextLine();
			String[] split = str.split(",");
			stall[i] = new Stalls(split[0], split[1], Double.parseDouble(split[2]), split[3]);
		}
		
		for(int i = 0; i < n; i++) {
			Thread t = new Thread(stall[i]);
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		double totalCost = 0.0;
		for(int i = 0; i < n; i++) {
			totalCost += stall[i].getStallCost();
		}
		
		System.out.println(totalCost);
	}
}

//Output:
//Enter the number of stalls: 
//3
//Book stall,Stall for books,25,John
//Food stall,Stall for foods,60,Peter
//Snack stall,Stall for snack,30,Adam
//17250.0
