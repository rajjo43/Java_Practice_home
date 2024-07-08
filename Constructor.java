//Java constructor
package self_study;

class A
{
	int a; String name;
	A()//constructor  (if we comment out this constructor,by default it will print out output=(0 null )
	{
		a=3; name="rajjo";
	}
	void show() {
	System.out.println(a+" "+name);
	}
}

public class Constructor {

	public static void main(String[] args) {
	A obj=new A();
	obj.show();
	}

}
