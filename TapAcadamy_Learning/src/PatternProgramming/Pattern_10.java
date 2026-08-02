import java.util.Scanner;
public class Pattern_10 {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int k=i;k<n;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=((i*2)-1);j++) {
				System.out.print("* ");
			}
			System.out.println();	
		}
	}
}
