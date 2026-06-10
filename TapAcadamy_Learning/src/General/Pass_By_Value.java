package General;
import java.util.*;
public class Pass_By_Value {
	int c;
	int add(int a, int b) {
		Scanner sc=new Scanner(System.in);
		a = 100;
		b = 200;
		return c = a + b;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Pass_By_Value PBV = new Pass_By_Value();
		System.out.println("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2: ");
		int num2 = sc.nextInt();
		int result = PBV.add(num1, num2);
		System.out.printf("Result: %d",result);
	}
}
