package self_study;

class B
{
	B(int a, int b)
	{
		int sum=a+b;
		System.out.println("Both Integer:" +sum);
	}
	B(int a,double b)
	{
		double sum=a+b;
		System.out.println("Integer and Double:" +sum);
	}
	B(double a,double b)
	{
		double sum=a+b;
		System.out.println("Both Double:" +sum);
	}
	B(int a,String b)
	{
		System.out.println(a+" "+b);
	}
}

public class Parametrized_Constructor {

	public static void main(String[] args) {
		B obj1=new B(5,4);
		B obj2=new B(5,4.0);
		B obj3=new B(5.0,4.0);
		B obj4=new B(5,"rajjo");
		
	/*    This is also called method overloading in polymorphism
		  Polymorphism-->having same method name(return type can be different), but different object   */
		
		/* if we write code like this-
		   void C(int a,int b)
		   {
		       ....
		   }
		   void D(int a,double b){....}
		   
		* Then we can create object like underneath-
	    B obj=new B();
		obj.C(5, 4);
		obj.D(5, 4.0);
		obj.E(5.0, 4.0);
		obj.F(5, "rajjo");*/
		System.out.println("This is a java parametrized constructor example");

	}

}
