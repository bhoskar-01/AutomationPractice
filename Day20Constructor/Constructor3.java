package Day20Constructor;

public class Constructor3 {
	int roll;
	double salary;

	void display() {
		System.out.println(roll + " " + salary);
	}

	public static void main(String args[]) {
		Constructor3 c1 = new Constructor3();
		c1.display();
	}
}