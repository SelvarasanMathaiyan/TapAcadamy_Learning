package Arrays;
import java.util.*;
public class Discount_Calculator_Program {
	float discount1 = 0.0f;
	float discount2 = 0.0f;
	float DisCalculator(float i, float s, float t, float n) {
		//Discount1 calculation
		discount1 = ((i*(7.0f/100)) + (s*(3.0f/100)) + (t*(2.0f/100)) + (n*(1.0f/100)));
		//Discount2 calculation
		float sum = i + s + t + n;
		if(sum <= 25000)
			discount2 = 0.0f;
		else if(sum >= 25001 && sum <= 50000)
			discount2 = sum*(5.0f/100);
		else if(sum >= 50001 && sum <= 100000)
			discount2 = sum*(7.0f/100);
		else if(sum > 100000)
			discount2 = sum*(10.0f/100);
		
		//System.out.println(discount1);
		//System.out.println(discount2);
		//Discount1 > Discount2 
		if(discount1 > discount2) 
			return discount1;
		else
			return discount2;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Discount_Calculator_Program dsc = new Discount_Calculator_Program();
		System.out.println("Enter the amount of Iron: ");
		float i = sc.nextFloat();
		System.out.println("Enter the amount of Steel: ");
		float s = sc.nextFloat();
		System.out.println("Enter the amount of Tungeston: ");
		float t = sc.nextFloat();
		System.out.println("Enter the amount of Nickel: ");
		float n = sc.nextFloat();
		System.out.println(dsc.DisCalculator(i, s, t, n));
	}
}
