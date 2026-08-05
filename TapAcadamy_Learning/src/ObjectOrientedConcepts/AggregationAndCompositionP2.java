package ObjectOrientedConcepts;
class Bike{
	private String brand;
	private int mileage;
	
	public Bike(String brand, int mileage) {
		super();
		this.brand = brand;
		this.mileage = mileage;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
}

class Book{
	private String name;
	private String author;
	
	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}

class Heart{
	private float weight;
	private int bpm;
	
	public Heart(float weight, int bpm) {
		super();
		this.weight = weight;
		this.bpm = bpm;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getBpm() {
		return bpm;
	}

	public void setBpm(int bpm) {
		this.bpm = bpm;
	}
}

class Brain{
	private float weight;
	private String color;
	
	public Brain(float weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

class Student{
	Heart h = new Heart(150, 72);
	Brain b = new Brain(200, "Gray");
	
	void hasA(Bike b) {
		System.out.println(b.getBrand());
		System.out.println(b.getMileage());
	}
	
	void hasA(Book bo) {
		System.out.println(bo.getName());
		System.out.println(bo.getAuthor());
	}
}
public class AggregationAndCompositionP2 {
	public static void main(String[] args) {
		Student s = new Student();
		Bike bike = new Bike("KTM", 20);
		Book book = new Book("Java", "JG");
		System.out.println(s.h.getWeight());
		System.out.println(s.h.getBpm());
		System.out.println(s.b.getWeight());
		System.out.println(s.b.getColor());
		
		s.hasA(bike);
		s.hasA(book);
		
		s = null;
//		System.out.println(s.h.getWeight());
//		System.out.println(s.h.getBpm());
//		System.out.println(s.b.getWeight());
//		System.out.println(s.b.getColor());
		
//		s.hasA(bike);
//		s.hasA(book);
		
		System.out.println(book.getName());
		System.out.println(book.getAuthor());
		System.out.println(bike.getBrand());
		System.out.println(bike.getMileage());
		
	}
}
