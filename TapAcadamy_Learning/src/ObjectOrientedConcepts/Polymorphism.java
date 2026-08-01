package ObjectOrientedConcepts;
// Polymorphism means single method can perform different behaviors depends upon the object that invoke it. In simple means one has many forms.
// It has two types: 1. compile time polymorphism (Method Overloading) 2. Run time polymorphism (Method Overriding)
// Compile time polymorphism means it is virtual polymorphism. Method Overloading is achieving it. It is 1 : 1 ratio.
// Run time polymorphism is a true polymorphism. because it 1 : M ratio it is prove the polymorphism. it has follows the Parent reference to child object --> Loose coupling. child reference to child object --> tight coupling.

// Parent reference to child Object --> Upcasting, Downcasting

class Plane1{
	
	void takeOff() {
		System.out.println("Plane is takeoff");
	}
	
	void fly() {
		System.out.println("Plane is flying");
	}
	
	void land() {
		System.out.println("Plane is landing");
	}
}

class CargoPlane1 extends Plane1{  //inherited

	@Override
	void takeOff() {
		System.out.println("Cargo Plane is takeoff the longer runway");
	}

	@Override
	void fly() {
		System.out.println("Cargo Plane is flying at the greatest height");
	}

	@Override
	void land() {
		System.out.println("Cargo Plane is landing on the Longer runway");
	}
	
	//It is specialized method
	void carryCargo1() { 
		System.out.println("Cargo Plane is carrying cargo");
	}
}
class PassengerPlane1 extends Plane1{ //inherited
	
	@Override
	void takeOff() {
		System.out.println("Passenger Plane is takeoff the medium runway");
	}

	@Override
	void fly() {
		System.out.println("Passenger Plane is flying at the medium height");
	}

	@Override
	void land() {
		System.out.println("Passenger Plane is landing on the medium runway");
	}
	
}
class FighterPlane1 extends Plane1{ //inherited
	
	@Override
	void takeOff() {
		System.out.println("Fighter Plane is takeoff the shorter runway");
	}

	@Override
	void fly() {
		System.out.println("Fighter Plane is flying at the low height");
	}

	@Override
	void land() {
		System.out.println("Fighter Plane is landing on the shorter runway");
	}
	
}

class Airport{
	// it is code flexibility - one method can perform different outputs.
	static void permit(Plane1 p) {
		p.takeOff(); 
		p.fly();
		p.land();
	}
}

public class Polymorphism {
	public static void main(String[] args) { 
		
		//child ref to child obj
		CargoPlane1 cp = new CargoPlane1();
		PassengerPlane1 pp = new PassengerPlane1();
		FighterPlane1 fp = new FighterPlane1();
		
/*		//Parent ref
		Plane1 p;
		
		//Parent ref to child obj
		p = cp;
		
		p.takeOff(); // Upcasting - It is access only inherited overridden method in child class object using parent ref. It can achieve loose coupling. so also achieve polymorphism.
		p.fly();
		p.land();
		((CargoPlane1)(p)).carryCargo1(); // Downcasting - It is access specialized method in child class object using parent ref.
		
		//Parent ref to child obj
		p = pp;
		
		p.takeOff();
		p.fly();
		p.land();
		
		//Parent ref to child obj
		p = fp;
		
		p.takeOff();
		p.fly();
		p.land(); */
		
		Airport.permit(cp);
		Airport.permit(pp);
		Airport.permit(fp);
		
	}
}

//Advantage of polymorphim --> code flexibility, code size reduce