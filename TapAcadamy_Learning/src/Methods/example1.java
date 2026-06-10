package Methods;
import java.util.*;
public class example1 {
	int a=10;
	int b=20;
	void add() {
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		example1 exp=new example1();
		exp.add();
	}
}
