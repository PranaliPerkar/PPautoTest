package assignment1;
public class Arithmetic {
	
	public int sum(int a, int b) {
		int c = a + b;
		return c;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {

		// ((((10+2)+2)-2)*2)/2)

		Arithmetic ar = new Arithmetic();

		int a = ar.sum(10, 2);
		int b = ar.sum(a, 2);
		int c = ar.subtract(b, 2);
		int d = ar.multiply(c, 2);
		int assignment1 = ar.divide(d, 2);

		System.out.println("((((10+2)+2)-2)*2)/2) = " + assignment1);

		// ((((10-2)+2)-2)*2)/2)

		int p = ar.subtract(10, 2);
		int q = ar.sum(p, 2);
		int r = ar.subtract(q, 2);
		int s = ar.multiply(r, 2);
		int assignment2 = ar.divide(s, 2);

		System.out.println("((((10-2)+2)-2)*2)/2) = " + assignment2);

	}

}
