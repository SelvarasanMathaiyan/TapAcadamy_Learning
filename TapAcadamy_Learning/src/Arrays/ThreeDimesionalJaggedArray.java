package Arrays;
import java.util.*;
public class ThreeDimesionalJaggedArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[][][] arr = new int[2][][];
		arr[0] = new int[3][];
		arr[1] = new int[2][];
		arr[0][0] = new int[2];
		arr[0][1] = new int[3];
		arr[0][2] = new int[4];
		arr[1][0] = new int[2];
		arr[1][1] = new int[3];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				for(int k = 0; k < arr[i][j].length; k++) {
				System.out.println("Enter the Age of School "+i+" Class "+j+" Student "+k);
				arr[i][j][k] = sc.nextInt();
				}
			}
		}
		System.out.println("The ages are : ");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				for(int k = 0; k < arr[i][j].length; k++) {
				System.out.println(arr[i][j][k]);
				}
			}
		}
	}
}

