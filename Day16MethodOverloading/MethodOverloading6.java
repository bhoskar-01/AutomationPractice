package Day16MethodOverloading;
/**
 * what if return type, method name and argument list are same.
 */
public class MethodOverloading6
{
   public int myMethod1(int num1, int num2)
   { 
       System.out.println("First myMethod of class Demo");
       return num1+num2;
   }
   public int myMethod(int var1, int var2)
   {
       System.out.println("Second myMethod of class Demo");
       return var1-var2;
   }

   public static void main(String args[])
   {
       MethodOverloading6 obj1= new MethodOverloading6();
       obj1.myMethod1(10,10);
       obj1.myMethod1(20,12);
   }
}