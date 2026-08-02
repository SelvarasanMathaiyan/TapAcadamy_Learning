import java.util.*;
public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				int k=i*j;
				if(k<10) {
					System.out.print(0);
					System.out.print(i*j+" ");
				}
				else
					System.out.print(i*j+" ");
			}
			System.out.println();
		}
	}

}
