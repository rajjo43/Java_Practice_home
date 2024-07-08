//constructor overloading--a class can have more than 1 constructor method,with different parameter list
package self_study;

class Overload
{
	int a; double b; String c;
	Overload()
	{
		a=34;b=45.67;c="rajjo";
	}
	Overload(int x)
	{
		a=x;
	}
	Overload(int x,double y)
	{
		a=x; b=y;
	}
	Overload(double y,String z)
	{
		b=y; c=z;
	}
}

public class Constructor_Overloading {

	public static void main(String[] args) {
		Overload r1= new Overload();
		Overload r2= new Overload(10);
		Overload r3= new Overload(15,20.5);
		Overload r4= new Overload(34.5,"rajjooz");
		System.out.println(r1.a+" "+r1.b+" "+r1.c);
		System.out.println(r2.a);
		System.out.println(r3.a+" "+r3.b);
		System.out.println(r4.b+" "+r4.c);

	}

}
