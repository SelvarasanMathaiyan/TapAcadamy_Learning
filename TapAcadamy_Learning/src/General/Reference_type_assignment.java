package General;

import java.util.*;
class test{
	String str;
	int n;
}
public class Reference_type_assignment {
	public static void main(String...args) {
		test t1=new test();
		t1.str="Selvarasan";
		t1.n=50;
		System.out.println(t1.str);
		System.out.println(t1.n);
		test s1;
		s1=t1;
		System.out.println(s1.str);
		System.out.println(s1.n);
	}
}
