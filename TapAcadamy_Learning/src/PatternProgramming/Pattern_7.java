import java.util.Scanner;
public class Pattern_7 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				if(i==1||j==i||j==n)
					System.out.print(j+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
