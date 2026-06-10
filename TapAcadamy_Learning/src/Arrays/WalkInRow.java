package Arrays;

import java.util.*;
public class WalkInRow {
	static int calculateWidth(int wallHeight, int height[]) {
		int width = 0;
		for(int i = 0; i < height.length; i++) {
			if(height[i] <= wallHeight) {
				width++;
			} else if(height[i] > wallHeight) {
				width+=2;
			}
		}	
		return width;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int noPersons = sc.nextInt();
		int wallHeight =  sc.nextInt();
		int height[] = new int[noPersons];
		for(int i = 0; i < height.length; i++) {
			height[i] = sc.nextInt();
		}
		System.out.println(calculateWidth(wallHeight, height));
	}
}
