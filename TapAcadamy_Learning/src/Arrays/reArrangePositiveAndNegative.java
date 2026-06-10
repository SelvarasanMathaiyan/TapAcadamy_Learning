package Arrays;

import java.util.*;
public class reArrangePositiveAndNegative {
	public static void reArrange(int arr[]) {
		int neg = 0;
		while(neg < arr.length && arr[neg] >= 0) {
			neg++;
		}
		int i = neg + 1;
		while(i < arr.length) {
			if(arr[i] >= 0) {
				int temp = arr[i];
				int j = i;
				while(neg < j) {
					arr[j] = arr[j-1];
					j--;
				}
				arr[neg] = temp;
				neg++;
			}
			i++;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		reArrange(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
}
