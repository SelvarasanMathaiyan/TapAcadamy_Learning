package ExceptionHandling;
import java.util.Scanner;

class CourseFullException extends Exception{
	@Override
	public String getMessage() {
		return "Error: The course is full.";
	}
}
class PrerequisiteNotMetException extends Exception{
	@Override
	public String getMessage() {
		return "Error: You must complete the prerequisite course first.";
	}
}
class Course{
	void checkAvailability(int noOfAvailSeats, boolean prerequisite) throws CourseFullException, PrerequisiteNotMetException{
		if(noOfAvailSeats == 0) {
			CourseFullException cfe = new CourseFullException();
			throw cfe;
		}
		else if(prerequisite == false){
			PrerequisiteNotMetException pnme = new PrerequisiteNotMetException();
			throw pnme;
		}
		else{
			System.out.println("Enrollment successful: You are now enrolled in the course.");
		}
	}
}
public class CustomExceptionEX2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfAvailSeats = sc.nextInt();
		boolean prerequisite = sc.nextBoolean();
		Course c = new Course();
		try{
			c.checkAvailability(noOfAvailSeats, prerequisite);
		}
		catch(CourseFullException cfe){
			System.out.println(cfe.getMessage());
		}
		catch(PrerequisiteNotMetException pnme){
			System.out.println(pnme.getMessage());
		}
	}
}


