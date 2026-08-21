package ObjectOrientedConcepts;
import java.util.*;
abstract class Shape{
	
	float area;
	
	abstract void acceptInput();
	abstract void calcArea();
	
	void dispArea() {
		System.out.println(area);
	}
	
}

class Square extends Shape{
	
	float side;
	Scanner sc = new Scanner(System.in);
	@Override
	void acceptInput() {
		System.out.println("Enter the sides of square: ");
		side = sc.nextFloat();
	}

	@Override
	void calcArea() {
		area = side * side;
	}
	
}

class Rectangle extends Shape{
	
	float length;
	float breadth;
	
	Scanner sc = new Scanner(System.in);
	@Override
	void acceptInput() {
		System.out.println("Enter the length of rectangle: ");
		length = sc.nextFloat();
		System.out.println("Enter the breadth of rectangle: ");
		breadth = sc.nextFloat();
	}

	@Override
	void calcArea() {
		area = length * breadth;
	}
	
}

class Circles extends Shape{

	float radius;
	Scanner sc = new Scanner(System.in);
	@Override
	void acceptInput() {
		System.out.println("Enter the radius of circle: ");
		radius = sc.nextFloat();
	}

	@Override
	void calcArea() {
		area = 3.141f * radius * radius;
	}
	
}

class Geometry{
	static void permit(Shape ref) {
		ref.acceptInput();
		ref.calcArea();
		ref.dispArea();
	}
}
public class AbstractionProgram3 {
	public static void main(String[] args) {
		Square s = new Square();
		Rectangle r = new Rectangle();
		Circles c = new Circles();
		
		Geometry.permit(s);
		Geometry.permit(r);
		Geometry.permit(c);
	}
}
