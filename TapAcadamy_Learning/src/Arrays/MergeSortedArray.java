package Arrays;

import java.util.*;
public class MergeSortedArray {
	static int[] mergeSorting(int arr1[], int arr2[]) {
		int result[] = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;
		while((arr1.length > i) && (arr2.length > j) ){
			if(arr1[i] < arr2[j]) {
				result[k] = arr1[i];
				i++;
				k++;
			}
			else {
				result[k] = arr2[j];
				j++;
				k++;
			}		
		}
		while(arr1.length > i) {
			result[k] = arr1[i];
			i++;
			k++;
		}
		while(arr2.length > j) {
			result[k] = arr2[j];
			j++;
			k++;
		}
		return result;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int arr1[] = new int[n1];
		int arr2[] = new int[n2];
		for(int i = 0 ; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		for(int j = 0; j < arr2.length; j++) {
			arr2[j] = sc.nextInt();
		}
		int result[] = mergeSorting(arr1, arr2);
		for(int k = 0; k < result.length; k++) {
			System.out.print(result[k] + " ");
		}
	}
}
