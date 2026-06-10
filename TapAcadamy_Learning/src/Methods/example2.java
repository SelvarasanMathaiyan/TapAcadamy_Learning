package Methods;
import java.util.*;
public class example2 {
	int a = 40;
	int b = 50;
	int add() {
		int c = a + b;
		return c;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		example2 exp=new example2();
		int result=exp.add();
		System.out.println(result);
	}
}
