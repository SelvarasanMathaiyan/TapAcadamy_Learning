package General;
class Car{
	String name;
	int cost;
	void modifyCar(Car y) {
		y.name = "BMW";
		y.cost = 9000000;
	}
}
public class Pass_By_Reference {
	public static void main(String args[]) {
		Car x = new Car();
		x.name = "Maruthi";
		x.cost = 8000000;
		System.out.println(x.name);
		System.out.println(x.cost);
		x.modifyCar(x);
		System.out.println(x.name);
		System.out.println(x.cost);
	}
}
