package Pattern;

import java.util.*;
public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int k=1;k<n-i;k++) {
				System.out.print("  ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
