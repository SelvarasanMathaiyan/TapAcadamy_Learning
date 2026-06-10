package Arrays;

import java.util.*;
public class SumOfNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			for(int j = 0; j < arr.length;j++) {
				if(i != j) {
					sum += arr[j];
				}
				System.out.println(sum);
			}
			if(max < sum)
			max = sum;
			else if(min > sum)
			min = sum;
		}
		System.out.println("SumOfMax = "+max);
		System.out.println("SumOfMin = "+min);
		
	}
}
