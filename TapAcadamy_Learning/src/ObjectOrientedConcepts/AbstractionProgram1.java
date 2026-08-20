package ObjectOrientedConcepts;

// Abstraction in java - Abstraction is a process of hiding implementation details and showing only the essential features of an object of the user. In java abstraction is achieved using abstract classes.

// Abstract method means incomplete method. only signature of method statement is there. not have a body. so we told the compiler it is abstract class and method using abstract keyword.

abstract class Plane2{ // An abstract class is such a class whose object cannot be created directly. However within a class even if a single method is abstract then the whole class must declared as abstract.
	abstract void takeoff();
	abstract void fly();
	abstract void land();
	
	void fuel() {
		System.out.println("Fuel method");
	}
}

abstract class Plane3{ // An abstract class may or may not contain abstract method, it is allowed. because we may want to prevent direct object creation of that class.
	void takeoff() {
		System.out.println();
	}
}

class CargoPlane2 extends Plane2{
	
	@Override
	void takeoff() {
		System.out.println("Cargo Plane is takeoff on long run way");
	}

	@Override
	void fly() {
		System.out.println("Cargo Plane is flying at the low heights");
	}

	@Override
	void land() {
		System.out.println("Cargo Plane is landing on long run way");
	}
	
}

class PassengerPlane2 extends Plane2{
	
	@Override
	void takeoff() {
		System.out.println("Passenger Plane is takeoff on medium run way");
	}

	@Override
	void fly() {
		System.out.println("Passenger Plane is flying at the medium heights");
	}

	@Override
	void land() {
		System.out.println("Passenger Plane is landing on medium run way");
	}
	
}

class FighterPlane2 extends Plane2{

	@Override
	void takeoff() {
		System.out.println("Fighter Plane is takeoff on short run way");
	}

	@Override
	void fly() {
		System.out.println("Fighter Plane is flying at the higher heights");
	}

	@Override
	void land() {
		System.out.println("Fighter Plane is landing on short run way");
	}
	
}

class Airport2{
	static void permit(Plane2 ref) {
		ref.takeoff();
		ref.fly();
		ref.land();
		ref.fuel(); //1. child class inherit the parent class method. create the object for the child class using the parent reference. it is accessed the abstract parent class method.
	}
}

public class AbstractionProgram1 {
	public static void main(String[] args) {
		
//		Plane2 p3 = new Plane2(); //cannot instantiate. because it is abstract class. but we have access for inherited create for child class object.
		
		CargoPlane2 cp = new CargoPlane2();
		cp.fuel(); //2. child class inherit the parent class method. create the object for the child class. it is accessed the abstract parent class method.
		PassengerPlane2 pp = new PassengerPlane2();
		FighterPlane2 fp = new FighterPlane2();
		
		Airport2.permit(cp);
		Airport2.permit(pp);
		Airport2.permit(fp);
		
		
	}
}
