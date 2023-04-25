package Day20Constructor;

public class Constructor1 {
	Constructor1() {
		System.out.println("This is a zero-para constructor");
	}
	Constructor1(char c) {
		System.out.println("This is a single-para constructor");
	}
	Constructor1(int num1, int num2) {
		System.out.println("This is a int-int parameterized constructor");
	}	
	Constructor1(double num1, int num2) {
		System.out.println("This is a double-int parameterized constructor");
	}
	Constructor1(int num1, double num2) {
		System.out.println("This is a int-double parameterized constructor");
	}
	Constructor1(double num1, boolean num2,char c) {
		System.out.println("This is a double-int-char parameterized constructor");
	}
	public static void main(String[] args) {
		Constructor1 c1 = new Constructor1();
		Constructor1 c2 = new Constructor1(10, 20);
		Constructor1 c3 = new Constructor1('d');
		Constructor1 c4 = new Constructor1(10d, 20);
		Constructor1 c5 = new Constructor1(10, 20.45);
		Constructor1 c6 = new Constructor1(10,false,'x');
	}
}

/**
 * Constructor Overloading: more than on constructor in a class 
 * Rule: 1. type of args differ or 
 * 		 2. number of args differ or 
 * 		 3. position of args differ
 * 
 */