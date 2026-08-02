import java.util.*;
public class Pattern__2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int count=(i*(i+1))/2;
			for(int j=1;j<=i;j++) {
				if(i==j) {
					System.out.print(count-- +" ");
				}
				else {
					System.out.print(count--);
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
	}

}
