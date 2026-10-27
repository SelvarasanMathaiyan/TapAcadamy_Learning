package Multithreading;
import java.util.*;
//Program is stored in hard disk, it is called program. It is move to the RAM, it is called the task/process.
//Single threading - Single threading means executing a program using only one thread of execution. Tasks are generally execute one after another in sequence. It is called single threaded program (or) sequential program.
//disadvantage - Efficient utilization of CPU time was not happened.
public class Singlethreading {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Addition process is started");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a + b;
		System.out.println(c);
		System.out.println("Addition process is ended");
		System.out.println("Character printing is started");
		for(int i = 65; i <= 75; i++) {
			System.out.println((char)i);
			Thread.sleep(4000);
		}
		System.out.println("Character printing is ended");
		System.out.println("Numbers printing is started");
		for(int i = 10; i <= 20; i++) {
			System.out.println(i);
			Thread.sleep(4000);
		}
		System.out.println("Numbers printing is ended");
	}
}
