package Arrays;

import java.util.*;
public class Consecutive_Subarray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		//printConsectiveSubArray(arr);
		//printConsecutiveSubArrayEleLen(arr);
		//findConsecutiveSubArrayLongestLength(arr);
		//findLongestConsecutiveSubArray(arr);
		printLongestSortedConsecutiveSubArray(arr);
		
	}
	public static void printLongestSortedConsecutiveSubArray(int[] arr) {
		// TODO Auto-generated method stub
		int count = 1, max = 0, ei = 0, si = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] <= arr[i+1]) {
				count++;
			}
			else {
				if(count > max) {
					max = count;
					ei = i;
				}
				count = 1;
			}
		}
		if(count > max) {
			max = count;
			ei = arr.length - 1;
		}
		si = ei - max + 1;
		for (int i = si; i <= ei; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void findLongestConsecutiveSubArray(int[] arr) {
		// TODO Auto-generated method stub
		int count = 1, max = 0, endIndex = 0, startIndex = 0;
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i+1] - arr[i] == 1) {
				count++; 
			}
			else
			{
				if(count > max) {
					max = count;
					endIndex = i;
				}
				count = 1;
			}
		}
		if(count > max) {
			max = count;
			endIndex = arr.length-1;
		}
		startIndex = endIndex - max + 1;
		for (int i = startIndex; i <= endIndex; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void printConsectiveSubArray(int arr[]) {
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i+1] - arr[i] == 1) {
				System.out.print(arr[i] + " ");
			}
			else {
				System.out.println(arr[i] + " ");
			}
		}
		System.out.println(arr[arr.length-1]);
	}
	public static void printConsecutiveSubArrayEleLen(int arr[]) {
		int count = 1;
		for(int i = 0; i < arr.length-1; i++) {
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
	public static void findConsecutiveSubArrayLongestLength(int[] arr) {
		// TODO Auto-generated method stub
		int maxLength = 0;
		int count = 1;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i+1]-arr[i] == 1) {
				count++;
			}
			else {
				if(count > maxLength) {
					maxLength = count;
				}
				count = 1;
			}
		}
		if(count > maxLength) {
			maxLength = count;
		}
		System.out.println(maxLength);
	}
}