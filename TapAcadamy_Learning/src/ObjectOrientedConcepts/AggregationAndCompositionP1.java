package ObjectOrientedConcepts;
//has-A relationship means the one class(Mobile) connected to a supporting class(Charger and OS) with a has-A relationship.
//has-A relationship has two types: 1. Aggregation 2. Composition
//Aggregation means it is loose bound. Aggregation is a weak "has-a" relationship where one class uses another class's object, but both objects can exist independently. EX: Charger is not inside the mobile. it is outside. but it is connect to mobile. Without this mobile is destroyed charger is connecting to another mobile. but still it is working.
//Composition means it is tight bound. Composition is a strong "has-a" relationship where one class owns another class's object, and the child object's life cycle depends on the parent object. EX: The Mobile owns the OS object. The OS object is created as part of the Mobile and is not intended to be shared independently.
class Charger{
	private String brand;
	private int voltage;
	
	public Charger(String brand, int voltage) {
		super();
		this.brand = brand;
		this.voltage = voltage;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int getVoltage() {
		return voltage;
	}
	
	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
}

class OS{
	private String name;
	private int size;
	
	public OS(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}

class Mobile{
	OS os = new OS("Android", 256); //class inside directly create the object without method. It is composition.
	
	void hasACharger(Charger c) { //Aggregation
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}
}
public class AggregationAndCompositionP1 {
	public static void main(String[] args) {
		Mobile m = new Mobile(); //the mobile object created. inside the os object is created.
		Charger c = new Charger("Redmi", 12);
		System.out.println(m.os.getName()); //it is accessible inside the object to object.
		System.out.println(m.os.getSize());
		m.hasACharger(c); //call method to aggregation.
		
		m = null; 
		// If the mobile object reference is pointing to null. so doesn't accessible for composition and aggregation.
		// Without mobile object doesn't access the os object details.
		
//		System.out.println(m.os.getName()); 
//		System.out.println(m.os.getSize());
//		m.hasACharger(c);
		
		//But without mobile object, directly access the charger details using charger object.
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}
}
