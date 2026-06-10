package Arrays;
import java.util.*;
public class Angry_Professor {
	static String studentCalculation(int arr[], int k) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]<=0) {
				count++;
			}
		}
		if(count>=k)
			return "NO";
		else 
			return "YES";
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(studentCalculation(arr, k));
	}
}
