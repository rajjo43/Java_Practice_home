/* Executes--1)static block
             2)instance block
constructor block and static method will executes with our instructions

Static block can only access static variable
Instance block can access static and non-static variable
*/
package self_study;

class Block
{
	int a,b;static int c=40;
	//Default Constructor
	Block(){
		a=30;b=50;
		System.out.println("Constructor: a= "+a+"\tb= "+b+"\tc= "+c);
	}
	
	//Instance Block--(needed to create a object )
	{
		a=10;b=20;
		System.out.println("Instance   : a= "+a+"\tb= "+b+"\tc= "+c);
	}
	
	//Static Block--(not needed to create a object )
	static{
		System.out.println("This is a static block   and c= "+c);
	}
	
	//Static Method
	static void A(){
		System.out.println("This is another static block");
	}
}

public class Static_Instance_Block {

	public static void main(String[] args) {
		Block r =new Block();
		Block.A();//Static method can be called without creating object
	}

}
