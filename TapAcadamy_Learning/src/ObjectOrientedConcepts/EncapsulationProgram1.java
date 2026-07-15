package ObjectOrientedConcepts;
import java.util.*;
class Restaurant{
	private int id;
	private String name;
	private String email;
	private long phone;
	private String address;
	public Restaurant(int id, String name, String email, long phone, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public long getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
}
class EncapsulationProgram1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String arr[] = str.split(",");
		int id = Integer.parseInt(arr[0]);
		String name = arr[1];
		String email = arr[2];
		long phone = Long.parseLong(arr[3]);
		String address = arr[4];
		Restaurant res = new Restaurant(id, name, email, phone, address);
		System.out.println(res.getId());
		System.out.println(res.getName());
		System.out.println(res.getEmail());
		System.out.println(res.getPhone());
		System.out.println(res.getAddress());
	}
}

