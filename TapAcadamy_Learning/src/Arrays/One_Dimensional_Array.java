package Arrays;
import java.util.*;
public class One_Dimensional_Array {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		for(int i = 0; i < a.length; i++) {
			System.out.println("Enter the age of person "+i+":");
			a[i] = sc.nextInt();
		}
		System.out.println("The ages are : ");
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
}
