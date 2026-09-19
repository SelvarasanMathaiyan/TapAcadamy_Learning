package ObjectOrientedConcepts;
//In java-7 interface only allowed abstract methods and constants (variables). so it is pure abstraction. but one disadvantage doesn't update the interface in future.
//In java-8 interface allowed for same Java-7 features and additionally default methods and static methods is introduced. 
//In java-9 interface followed java-7 and java-8 and additionally private and private static methods is allowed.
interface Bikes{
	void start();
	
	// default method - default methods within an interface are methods with body. it is used to update the interface without breaking the code for all implementing classes. it is inherited and overridden.It is helps to call the private methods within interface class.
	default void stop() {
		changeGear();
		System.out.println("Stopped....");
	}
	
	// static method - static methods within an interface cannot be implementing and overridden. static methods call only for using interface class name.method name. It is helps to call the private methods is declared as static.
	static void fuel() {
		System.out.println("Fuel is important");
		accelarate();
	}
	
	// private method - private methods in interface used for code security. but it is only access within the interface using default and static methods.
	private void changeGear() {
		System.out.println("Change gears");
	}
	
	// private static method - it is same for private methods. but static methods is only access static methods.
	private static void accelarate() {
		System.out.println("Accerlate");
	}
}
class SportsBikes implements Bikes{
	public void start() {
		System.out.println("Started....");
	}
	@Override
	public void stop() {
		System.out.println("....");
		Bikes.super.stop();
	}
}
public class InterfaceinJava9 {
	public static void main(String[] args) {
		SportsBikes sb = new SportsBikes();
		sb.start();
		Bikes.fuel();
		sb.stop();
	}
}
