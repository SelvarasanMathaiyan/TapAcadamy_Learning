package Arrays;

import java.util.*;
public class HurdleRace {
	int hurdleRace(int k, int arr[]) {
		int maxheight = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > maxheight) {
				maxheight = arr[i];
			}
		}
		if(maxheight > k)
			return maxheight - k;
		else
			return 0;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		HurdleRace hr = new HurdleRace();
		int k = sc.nextInt();
		int n =  sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(hr.hurdleRace(k, arr));
	}
}
