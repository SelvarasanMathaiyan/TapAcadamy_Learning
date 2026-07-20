package ObjectOrientedConcepts;
import java.util.*;
class Circle{
	private static float PI;
	private float r;
	private float area;
	static {
		PI = 3.14f;
	}
	public void getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		r = sc.nextFloat();
	}
	public void calculateArea() {
		area = PI * r * r;
	}
	public void displayOutput() {
		System.out.println(area);
	}
}
public class StaticExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		c1.getInput();
		c1.calculateArea();
		c1.displayOutput();	
	}

}
