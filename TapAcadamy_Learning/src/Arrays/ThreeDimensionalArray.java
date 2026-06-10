package Arrays;
import java.util.*;
public class ThreeDimensionalArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[][][] arr = new int[2][3][5];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				for(int k = 0; k< arr[i][j].length; k++) {
					System.out.println("Enter the age of "+i+" school "+j+" class "+k+" person");
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {	
			for(int j = 0; j < arr[i].length; j++) {
				for(int k = 0; k< arr[i][j].length; k++) {
					System.out.println(arr[i][j][k]);
				}
			}
		}
	}
}
