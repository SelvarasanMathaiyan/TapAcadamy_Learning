package ObjectOrientedConcepts;
import java.util.*;
class Customer2{
	private int cid;
	private String cname;
	private long cnumber;
	//In java automatically create the default constructor.
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
class Customer3{
	private int cid;
	private String cname;
	private long cnumber;
	public Customer3() {
		cname = "Rohit";
	}
	public Customer3(int cid){
		this();
		this.cid = cid;
	}
	public Customer3(int cid, String cname, long cnumber) {
		this(cid); //this() must be present in first line of constructor. It was take the control inside the same class one constructor to an other constructor. One constructor control go to the other constructor depends upon the parameterized or not.
		
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
public class ConstructorAndThisMethod {
	public static void main(String[] args) {
	//	Customer2 c2 = new Customer2(); //It is a default constructor. 
	//	System.out.println(c2.getCid() + " " + c2.getCname() + " " + c2.getCnumber()); //Output: 0 null 0
		
		Customer3 c3 = new Customer3(102, "Selva", 7010025820L);// It is a parameterized constructor.
		System.out.println(c3.getCid() + " " + c3.getCname() + " " + c3.getCnumber()); //Output: 102 Rohit 0
	}
}
