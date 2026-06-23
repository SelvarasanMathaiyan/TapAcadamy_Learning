package String_Program;
import java.util.*;
public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String str = "java";
//		String str = "India Today";
		String str = "I love java";
//		String str = "India is my Country";
//		String str = "i love java programming language";
//		String str = "One Two Three Four Five Six";
		System.out.println("Input-1: "+ str+"\n");
		System.out.println("Output-1: "+printOutputOne(str));
		System.out.println("Output-2: "+printOutputTwo(str));
		System.out.println("Output-3: "+printOutputThree(str));
		System.out.println("Output-4: "+printOutputFour(str));
		System.out.println("Output-5: "+printOutputFive(str));
		System.out.println("Output-6: "+printOutputSix(str));
	}
	
	public static String reverse(String str) {
		char ch[] = str.toCharArray();
		int i = 0, j = str.length()-1;
		while(i <= j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++; j--;
		}
		return new String(ch);
	}
	
	public static String printOutputOne(String str) {
		// TODO Auto-generated method stub
		String arr[] = str.split(" ");
		String ans = "";
		for (int i = 0; i < arr.length; i++) {
			ans += reverse(arr[i]);
			if(i != arr.length-1) {
				ans += " ";
			}
		}
		return ans;
	}
	
	public static String printOutputTwo(String str) {
		// TODO Auto-generated method stub
		String arr[] = str.split(" ");
		String ans = "";
		for (int i = arr.length-1; i >= 0; i--) {
			ans += arr[i];
			if(i != 0) {
				ans += " ";
			}
		}
		return ans;
	}
	
	public static String printOutputThree(String str) {
		// TODO Auto-generated method stub
		String arr[] = str.split(" ");
		String ans = "";
		for (int i = 0; i < arr.length; i++) {
			ans += arr[i] + arr[i].length();
			if(i != arr.length-1) {
				ans += " ";
			}
		}
		return ans;
	}
	
	public static String printOutputFour(String str) {
		// TODO Auto-generated method stub
		String arr[] = str.split(" ");
		String ans = "";
		for (int i = 0; i < arr.length-1; i+=2) {
			ans += arr[i+1] + " " +arr[i];
			if(i + 2 < arr.length) {
				ans += " ";
			}
		}
		if(arr.length % 2 != 0) {
			ans += arr[arr.length-1];
		}
		return ans;
	}
	
	public static String printOutputFive(String str) {
		// TODO Auto-generated method stub
		String arr[] = str.split(" ");
		String ans = "";
		int i = 0, j = arr.length-1;
		while(i < j) {
			ans += arr[i] + arr[j];
			i++; j--;
			if(i < j) {
				ans += " ";
			}
		}
		if(i == j) {
			if(ans.length() > 0) 
				ans += " "+arr[i];
			else
				ans += arr[i];
		}
		return ans;
	}
	
	public static String printOutputSix(String str) {
		// TODO Auto-generated method stub
		String arr[] = str.split(" ");
		String ans = "";
		int i = 0, j = arr.length-1;
		while(i < j) {
			ans += reverse(arr[j]) + arr[i];
			i++; j--;
			if(i < j) {
				ans += " ";
			}
		}
		if(i == j) {
			if(ans.length() > 0) 
				ans += " "+arr[i];
			else
				ans += arr[i];
		}
		return ans;
	}
	
	
}
