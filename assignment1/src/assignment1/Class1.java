package assignment1;

public class Class1 {

	public Class1() {
		this(10, 20, 30, 40);
		System.out.println("Default constructor");
	}
	public Class1(int a) {
		this();
		System.out.println("1 parameterized constructor");
	}

	public Class1(int a, int b) {

		this(10);
		System.out.println("2 parameterized constructor");
	}

	public Class1(int a, int b, int c) {

		this(11, 12);
		System.out.println("3 parameterized constructor");
	}

	public Class1(int a, int b, int c, int d) {

		System.out.println("4 parameterized constructor");
	}

	public static void main(String[] args) {
		/*
		 * 4 parameterized constructor 
		 * default constructor 
		 * 1 parameterized constructor 
		 * 2 parameterized constructor 
		 * 3 parameterized constructor
		 */
		Class1 Obj1 = new Class1(11, 12, 13);

	}

}
