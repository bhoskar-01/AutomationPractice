package Day28Casting;

class Parent100{
	void myHome() {
		System.out.println("Parent home");
	}
}
class Child100 extends Parent100{
	void myCar() {
		System.out.println("Child car");
	}
}
public class Casting {
	public static void main(String[] args) {
		Child100 c2=new Child100();
		c2.myCar();
		c2.myHome();
		Parent100 c1=new Parent100();		
		c1.myHome();
		System.out.println("***************Using Upcasting****************");
		//usig casting concept
		Child100 c3=new Child100();
		c3.myCar();
		c3.myHome();
		Parent100 c4=new Child100();//auto upcasting
		c4.myHome();
		Parent100 c5=c3;//auto upcasting ---> Parent100 c5=c3 =new Child100();
		c5.myHome();
		
	}
}