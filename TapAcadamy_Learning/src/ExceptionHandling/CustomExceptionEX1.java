package ExceptionHandling;
import java.util.*;
class UnderAgeException extends Exception{
	@Override
	public String getMessage() {
		return "You are too young. Have patience!";
	}
	
}
class OverAgeException extends Exception{
	@Override
	public String getMessage() {
		return "You are too old. Cool down!";
	}
}
class License{
	int age;
	void getAge() {
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
	}
	void checkEligiblity() throws UnderAgeException, OverAgeException{
		if(age < 18) {
			UnderAgeException uae = new UnderAgeException();
			throw uae;
		}
		else if(age > 60) {
			OverAgeException oae = new OverAgeException();
			throw oae;
		}
		else {
			System.out.println("Eligibility confiremed. you can apply for a driving license.");
		}
	}
}
public class CustomExceptionEX1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		License l = new License();
		try {
			l.getAge();
			l.checkEligiblity();
		}
		catch(UnderAgeException uae){
			System.out.println(uae.getMessage());
		}
		catch(OverAgeException oae){
			System.out.println(oae.getMessage());
		}
	}
}
