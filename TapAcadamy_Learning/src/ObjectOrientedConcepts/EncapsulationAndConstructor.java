package ObjectOrientedConcepts;
import java.util.*;
class Customer1{
	private int cid;
	private String cname;
	private long cnumber;
	public Customer1(int cid, String cname, long cnumber) { //Constructor is does not return type. It is must same name of class name.
		this.cid = cid; //use same name for instance variable and local variable Shadowing error(name clash occur without this keyword) occurred. so  use this keyword for instance variable.
		this.cname = cname;
		this.cnumber = cnumber;
	}
	public int getCid() {
		return cid;
	}
	public String getCname() {
		return cname;
	}
	public long getCnumber() {
		return cnumber;
	}
}
// Encapsulation is a process of protecting important components of objects. it is preventing direct access. Encapsulation is not preventing access. It is providing controlled access.
public class EncapsulationAndConstructor {
	public static void main(String args[]) {
		Customer1 c1 = new Customer1(101, "Selva", 7010025820L); //default setter in java. It is a parameterized constructors. constructor is a specialized setter in java. It is during the object creation, helps initialized the object.
		System.out.println(c1.getCid() + " " + c1.getCname() + " " + c1.getCnumber());
	}
}
