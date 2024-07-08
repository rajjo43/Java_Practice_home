package self_study;

import java.util.Scanner;

class Name{
	
	Name(String n){  //parametrized constructor
		n="dog";
		System.out.println("doggy name: "+n);
	}
	
	void name() {  //void method
		String name ="Rajwshree";
		System.out.println("Name      :  "+name);
	}
	
	 int roll(int x){   //int method
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x   : ");
		x=input.nextInt();
		return x;
		
	}
	
}
class Dept extends Name{
	
	void name() {    //void method
		super.name();  // Calling the superclass void method
		String dept="CSE";
		System.out.println("Department: "+dept);
		System.out.println("Class ID  : "+super.roll(0) /*calling int method using super*/);
		
		
	}
	Dept(String n) {   //parametrized constructor
		super(n);      // Calling the superclass parametrized constructor
		n="cat";
		System.out.println("cat name  : "+n);
		
	}
	
}

public class Super_Keyword {

	public static void main(String[] args) {
		Dept r=new Dept(null);
		r.name();
		

	}

}
