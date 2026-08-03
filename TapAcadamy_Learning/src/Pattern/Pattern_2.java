package Pattern;

import java.util.*;
public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int k=i;k<n;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(j==1||j==i||i==n) {
					System.out.print("* ");	
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
