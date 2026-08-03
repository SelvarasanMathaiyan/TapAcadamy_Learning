package Pattern;

import java.util.*;
public class Pattern_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int count=i;
			if(i%2==0) {
				System.out.print(++count +" ");
			}
			for(int j=1;j<=n;j++) {
				System.out.print(i+" ");
			}
			if(i%2!=0) {
				System.out.print(++count +" ");
			}
			System.out.println();
		}
	}

}
