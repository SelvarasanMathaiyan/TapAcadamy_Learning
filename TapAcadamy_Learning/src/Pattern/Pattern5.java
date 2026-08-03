package Pattern;

import java.util.*;
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of row: ");
		int n=sc.nextInt();
		int count=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(count<10) {
					System.out.print(0);
					System.out.print(count++ +" ");
				}
				else
					System.out.print(count++ +" ");
			}
			System.out.println();
		}
	}

}
