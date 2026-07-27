package ObjectOrientedConcepts;
// Three type of inheritance methods
// 1. inherited methods - child class methods derived from the parent class without changed.
// 2. overridden methods - child class methods derived from the parent class but you are modified or change it.
// 3. specialized methods -  It is doesn't derived from the parent class. It is unique for the child class.
class Plane{
	void takeOff() { // inherited method.
		System.out.println("Plane is takeoff");
	}
	void fly() { 
		System.out.println("Plane is flying");
	}
	void land() { // inherited method.
		System.out.println("Plane is Landing");
	}
}
class CargoPlane extends Plane{
	void fly() { // overridden method.
		System.out.println("CargoPlane is flying at the low height");
	}
	void carryCargo() { // specialized method.
		System.out.println("CargoPlane is carry cargo");
	}
}

class PassengerPlane extends Plane{
	void fly() { // overridden method.
		System.out.println("PassengerPlane is flying at the medium height");
	}
	void carryPassengers() { // specialized method.
		System.out.println("PassengerPlane is carry passenger");
	}
}
class FighterPlane extends Plane{
	void fly() { // overridden method.
		System.out.println("FighterPlane is flying at the high height");
	}
	void carryWeapons() { // specialized method.
		System.out.println("FighterPlane is carry weapons");
	}
}
public class TypesOfInheritanceMethods {
	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		cp.takeOff();
		cp.fly();
		cp.land();
		cp.carryCargo();
		System.out.println();
		
		PassengerPlane pp = new PassengerPlane();
		pp.takeOff();
		pp.fly();
		pp.land();
		pp.carryPassengers();
		System.out.println();
		
		FighterPlane fp = new FighterPlane();
		fp.takeOff();
		fp.fly();
		fp.land();
		fp.carryWeapons();
	}
}
