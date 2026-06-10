package Arrays;
import java.util.*;
public class TwoDimensionalJaggedArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][];
		arr[0] = new int[3];
		arr[1] = new int[5];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the Age of Class "+i+" Student "+j);
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("The ages are : ");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
