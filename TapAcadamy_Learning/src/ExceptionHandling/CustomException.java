package ExceptionHandling;
import java.util.*;
//Custom Exception - In java doesn't know situation based exception. so we are create the custom exception. (ex: ATM machine)

//All types exceptions extends for Exception class.Because Exception is parent of all child exceptions. So create one class it extends the Exception class.

class InvalidUserException extends Exception{ //It is custom exception. it is extends for Exception class
	@Override
	public String getMessage() {
		return "Invalid PIN. Try again..!";
	}
}
class ATM{
	private int pin = 8888;
	private int p;
	void providePin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter PIN: ");
		p = sc.nextInt();
	}
	void validatePin() throws InvalidUserException{ // it is warns the caller method InvalidUserException is throw, you ready for handle the exception.
		if(pin == p) {
			System.out.println("Login Successfully..");
		}
		else {
			InvalidUserException iue = new InvalidUserException();
			System.out.println(iue.getMessage());
			throw iue; //throw the custom exception
		}
	}
}

class Bank{
	void initiate() {
		ATM atm = new ATM();
		try { //Nested try-catch. It is used 3 attempts is there. after third attempt it was blocked.
			atm.providePin();
			atm.validatePin();
		} catch (Exception e) {
			try {
				atm.providePin();
				atm.validatePin();
			}
			catch(Exception f) {
				try {
					atm.providePin();
					atm.validatePin();
				}
				catch(Exception g) {
					System.out.println("Card Blocked");
					System.exit(0);
				}
			}
		}
	}
}
public class CustomException {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.initiate();
	}
}
