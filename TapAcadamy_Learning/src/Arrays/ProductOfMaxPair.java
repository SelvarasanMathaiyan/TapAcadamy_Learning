package Arrays;

import java.util.*;
public class ProductOfMaxPair {
	public static int findMaxPair(int arr[]) {
		//largest and secondLargest pair
		int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]  > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			else if(arr[i] > secondLargest) {
				secondLargest =arr[i];
			}
		}
		System.out.println(largest);
		System.out.println(secondLargest);
		
		//smallest and secondSmallest pair
		int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]  < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			}
			else if(arr[i] < secondSmallest) {
				secondSmallest =arr[i];
			}
		}
		System.out.println(smallest);
		System.out.println(secondSmallest);
		
		int p1 = largest * secondLargest;
		int p2 = smallest * secondSmallest;
		return p1 > p2 ? p1 : p2;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int result = findMaxPair(arr);
		System.out.println(result);
		sc.close();
	}
}
