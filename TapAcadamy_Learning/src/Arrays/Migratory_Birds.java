package Arrays;
import java.util.*;
public class Migratory_Birds {
	static int migratoryBirds(int arr[]) {
		
		int birds[] = new int[6];
		for(int i = 0; i < arr.length; i++) {	
				birds[arr[i]]++;
		}
		int max = 0;
		int index = 0;
		for(int k = 1; k < birds.length; k++) {
			if(max<birds[k]) {
				max = birds[k];
				index = k;
			}
			else if((max==birds[k])&&(index<k)){
				
			}
		}
		return index;
	}
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(migratoryBirds(arr));
	}
}
