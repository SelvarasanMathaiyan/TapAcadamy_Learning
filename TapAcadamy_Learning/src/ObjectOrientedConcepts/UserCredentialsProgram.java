package ObjectOrientedConcepts;
import java.util.*;
class User{
	private Integer id;
	private String userName;
	private String password;
	public User(Integer id, String userName, String password) {
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
	public User() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
class UserBO{
	private User[] getUsers() {
		User[] users = new User[5];
		users[0] = new User(101, "Levis" , "BCDEF");
		users[1] = new User(102, "Massive" , "hpphef3");
		users[2] = new User(103, "Steve" , "Gpefxt");
		users[3] = new User(104, "Kallis" , "2345678");
		users[4] = new User(105, "Wipro" , "AS%");
		
		return users;
	}
	private String encryptPassword(String password) {
		String res = "";
		for (int i = 0; i < password.length(); i++) {
			res += (char)(password.charAt(i) + 1);
		}
		return res;
	}
	public boolean validate(String userName, String password) {
		User[] user = getUsers();
		for (int i = 0; i < user.length; i++) {
			String un = user[i].getUserName();
			String pw = user[i].getPassword();
			if(un.equals(userName) && pw.equals(encryptPassword(password))) {
				return true;
			}
		}
		return false;
	}
	
}
public class UserCredentialsProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserBO u = new UserBO();
		System.out.println("Username : ");
		String userName = sc.nextLine();
		System.out.println("Password : ");
		String password = sc.nextLine();
		if(u.validate(userName, password)) {
			System.out.println("Login Successfully!!!");
		}
		else {
			System.out.println("Invalid Credentials");
		}
	}
}
