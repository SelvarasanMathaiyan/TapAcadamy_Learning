package Arrays;
import java.util.*;
public class ConsecutiveSubArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		//printConsecutiveElements(arr);
		printConsecutiveEleLength(arr);
	}

	public static void printConsecutiveEleLength(int[] arr) {
		// TODO Auto-generated method stub
		int count = 1;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i+1] - arr[i] == 1) {
				count++;
			}
			else {
				System.out.println(count);
				count = 1;
			}
		}
		System.out.println(count);	
	}

	public static void printConsecutiveElements(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i+1] - arr[i] == 1) {
				System.out.print(arr[i] + " ");
			}
			else {
				System.out.println(arr[i] + " ");
				//System.out.println();
			}
		}
		System.out.println(arr[arr.length - 1]);
	}
}
