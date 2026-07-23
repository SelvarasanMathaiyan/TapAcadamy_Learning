package ObjectOrientedConcepts;
//Multiple Inheritance not supported in Java.
class Test1 extends Object{ //parent class
	int a = 10;
	void fun1() {
		System.out.println("Java");
	}
}
class Test2 extends Object{ //parent class
	int a = 20;
	void fun2() {
		System.out.println("Python");
	}
}
class Test3 extends Test1, Test2{ //child class - it is not supported in java. it is only supported for C++.
	void display() {
		System.out.println(a);
	}
}
public class MultipleInheritance {
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.display();
	}
}

//Diamond Shaped problem means Test1 and Test2 is extends the object class. Test3 is extends Test1 and Test2 class. one common a variable derived from Test1, Test2. but Test 3 is which once a is print. so it is confused. it is occurred for ambiguous type error.