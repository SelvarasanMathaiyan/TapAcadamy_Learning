package Arrays;

import java.util.*;
public class PrintSubArray {
	public static void printSubArray(int arr[], int k) {
		for(int size = arr.length; size > 1; size--) {
			for(int i = 0; i <= arr.length-size; i++) {
				int sum = 0;
				for(int j = i; j < size+i; j++) {
					sum += arr[j];
				}
				if(sum == k) {
					for(int j = i; j < size+i; j++) {
						System.out.print(arr[j] + " ");
					}
					return;
				}	
			}
		}
	}
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i = 0; i < arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	int k = sc.nextInt();
	printSubArray(arr, k);
}
}
