package Day20Constructor;

class Cons4 {
	int roll;
	double salary;
	Cons4(int r,double s){//r=101 s=250045.45
		roll=r;
		salary=s;
	}
	void display() {
		System.out.println(roll + " " + salary);
	}
	public static void main(String args[]) {
		Cons4 c1 = new Cons4(101,250045.45);
		c1.display();
		Cons4 c2 = new Cons4(201,550045.45);		
		c2.display();
	}
}