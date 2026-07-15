package ObjectOrientedConcepts;

import java.util.*;
class Restaurant1{
	private int id;
	private String name;
	private String email;
	private long phone;
	private String address;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
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
public class EncapsulationProgram2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Restaurant1[] res = new Restaurant1[n];
		for (int i = 0; i < res.length; i++) {
			
			Restaurant1 r = new Restaurant1();
			
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String email = sc.nextLine();
			long phone = sc.nextLong();
			sc.nextLine();
			String address = sc.nextLine();
			
			r.setId(id);
			r.setName(name);
			r.setEmail(email);
			r.setPhone(phone);
			r.setAddress(address);
			
			res[i] = r;
		}
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i].getId()+"\n"+res[i].getName()+"\n"+res[i].getEmail()+"\n"+res[i].getPhone()+"\n"+res[i].getAddress());
		}
	}
}

