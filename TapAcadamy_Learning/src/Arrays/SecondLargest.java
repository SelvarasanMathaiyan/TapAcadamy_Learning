package Arrays;

import java.util.*;
public class SecondLargest {
	public static int findSecondLargest(int arr[]) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(largest < arr[i]) {
				secondLargest = largest;
				largest = arr[i];
			}
			else if(secondLargest < arr[i]) {
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int result = findSecondLargest(arr);
		System.out.println(result);
	}
}
