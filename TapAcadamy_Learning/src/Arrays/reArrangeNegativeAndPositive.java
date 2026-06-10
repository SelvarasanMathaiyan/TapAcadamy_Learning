package Arrays;

import java.util.Scanner;
public class reArrangeNegativeAndPositive {
	public static void reArrange(int arr[]) {
		int pos = 0;
		while(pos < arr.length && arr[pos] < 0) {
			pos++;
		}
		int i = pos + 1;
		while(i < arr.length) {
			if(arr[i] < 0) {
				int temp = arr[i];
				int j = i;
				while(j > pos) {
					arr[j] = arr[j-1];
					j--;
				}
				arr[pos] = temp;
				pos++;
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
