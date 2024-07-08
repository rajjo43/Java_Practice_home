package self_study;

//by default constructor
class copy
{
	int a; String b;
	copy()
	{
		a=21;b="rajjo";
		System.out.println("a= "+a+ "\tb= "+b);
	}
	
	copy(copy ref)
	{
		int x=ref.a;
		String y=ref.b;
		System.out.println("x= "+x + "\ty= "+y);
	}
}

//by parametrized constructor
class copy2
{
	int sum;
	copy2(int a, int b)
	{
		sum=a+b;
		System.out.println("Both Integer:" +sum);
	}
	
	copy2(copy2 ref)
	{
		int sum2=ref.sum;
		System.out.println("Copying Both Integer:" +sum2);
	}
}


public class Copy_Constructor {

	public static void main(String[] args) {
		copy obj=new copy();
		copy obj2=new copy(obj);
		
		copy2 ob=new copy2(5,6);
		copy2 ob2=new copy2(ob);

	}

}
