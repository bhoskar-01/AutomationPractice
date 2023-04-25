package Day23Oops;

class testing10{
	void callingFromVoda() {
		System.out.println("Vodaphone network busy");
	}
}
class testing20 extends testing10{
	void callingFromIdea() {
		System.out.println("Get Idea sirji");
	}
}
class testing30 extends testing20{
	void callingFromAirtel() {
		System.out.println("try evrything");
	}
}
public class Example2 extends testing30 {
	void callingMe() {
		System.out.println("I am calling....");
	}
	public static void main(String[] args) {
		Example2 e1=new Example2();
		e1.callingMe();
		e1.callingFromAirtel();
		e1.callingFromIdea();
		e1.callingFromVoda();
		
//		testing1 t1=new testing1();
//		t1.callingFromVoda();
//		testing2 t2=new testing2();
//		t2.callingFromIdea();
//		testing3 t3=new testing3();
//		t3.callingFromAirtel();
	}
}