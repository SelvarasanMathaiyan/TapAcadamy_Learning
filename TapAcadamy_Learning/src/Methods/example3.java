package Methods;
import java.util.*;
public class example3 {
	int c;
	void add(int a, int b){
		c=a+b;
		System.out.println(c);
	}
	public static void main(String args[]) {
		example3 c1=new example3();
		int num1=80;
		int num2=50;
		c1.add(num1, num2);
	}
}
