package ExceptionHandling;
import java.util.*;

public class TryandMultipleCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Connection is Estd");
		
		try {
			System.out.println("Enter the numerator: ");
			int a = sc.nextInt();
			System.out.println("Enter the denominator: ");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println(c);
			
			System.out.println("Enter the array size: ");
			int size = sc.nextInt();
			int arr[] = new int[size];
			System.out.println("Enter the element: ");
			int ele = sc.nextInt();
			System.out.println("Enter the position to be stored in: ");
			int index = sc.nextInt();
			arr[index] = ele;
			System.out.println(arr[index]);
		}
		catch(ArithmeticException ae) {
			System.out.println("Provide non zero denominator");
		}
		catch(NegativeArraySizeException nas) {
			System.out.println("Provide positive array size");
		}
		catch(InputMismatchException im){
			System.out.println("Provide interger value");
		}
		catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println("Provide valid index");
		}
		catch(Exception e) {
			System.out.println("Invalid input");
		}
		
		System.out.println("Connection is terminated");
	}
}
