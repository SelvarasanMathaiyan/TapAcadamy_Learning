package Arrays;

import java.util.*;
public class CircularArray {
	static int[] circulator(int k, int arr[], int q[]) {
		//int b[] = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			q[(i + k) % arr.length] = arr[i];
		}
//		for(int i = 0; i < b.length; i++) {
//			q[i] = b[i];
//		}
		return q;
	}
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		int q[] = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		circulator(k, arr, q);
		for(int i = 0; i < q.length; i++) {
			System.out.print(q[i] + " ");
		}
		
	}
}
