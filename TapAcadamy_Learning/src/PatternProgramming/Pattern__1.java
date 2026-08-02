import java.util.*;
public class Pattern__1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n=sc.nextInt();
		int count=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}

}
