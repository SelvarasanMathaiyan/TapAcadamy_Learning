import java.util.*;
public class Pattern__6 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n=sc.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++) {
			char revch=(char)((ch-1)+i);
			for(int j=1;j<=i;j++) {
				if(i%2!=0) {
					System.out.print(ch++ + " ");
				}
				else
				{
					System.out.print(revch-- + " ");
					ch++;
				}
			}
			System.out.println();
		}
	}
}
