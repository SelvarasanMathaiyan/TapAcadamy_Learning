package Arrays;
import java.util.*;
public class Two_Dimensional_Array {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[2][5];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.println("Enter the age of person "+j+" school "+i+":");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("The ages are: ");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
	}
}
