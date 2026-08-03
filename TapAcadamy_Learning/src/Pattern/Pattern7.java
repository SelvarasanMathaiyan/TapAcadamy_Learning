package Pattern;

import java.util.*;
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(i+j +" ");
			}
			System.out.println();
		}
	}
}