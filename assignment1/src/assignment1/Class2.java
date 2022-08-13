package assignment1;

public class Class2 {
	
	public void m1() {
		
		System.out.println("Default method");
		this.m5(4, 5, 6, 7);
	}
	
public void m2(int a) {
		
		System.out.println("One parameterized method");
		this.m3(9,10);
	}

public void m3(int a, int b) {
	
	System.out.println("Two parameterized method");

}

public void m4(int a, int b, int c) {
	
	System.out.println("Three parameterized method");
	this.m1();
}

public void m5(int a, int b, int c, int d) {
	
	System.out.println("Four parameterized method");
	this.m2(8);
}
	public static void main(String[] args) {
		
		Class2 obj1 = new Class2();
		obj1.m4(1,2,3);
		System.out.println("This is a new change");
		
		
		
	}

}
