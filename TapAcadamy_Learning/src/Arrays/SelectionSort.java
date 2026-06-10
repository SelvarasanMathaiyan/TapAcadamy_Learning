package Arrays;

import java.util.*;
public class SelectionSort {
	static void selectionSort(int arr[]) {
		int n = arr.length;
		for(int i = 0; i < n-1; i++) {
			int min_i = i;
			for(int j = i + 1; j < n; j++) {
				if(arr[j] < arr[min_i]) {
					min_i = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_i];
			arr[min_i] = temp;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		selectionSort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
