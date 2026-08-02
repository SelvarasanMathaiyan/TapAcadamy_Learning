import java.util.Scanner;
public class Pattern_12 {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=n-i;k++) {
				System.out.print("  ");
			}
			int count=1;
			for(int j=1;j<=((i*2)-1);j++) {
				if(i<=j)
					System.out.print(count-- +" ");
				else
					System.out.print(count++ +" ");
			}
			System.out.println();	
		}
	}
}
