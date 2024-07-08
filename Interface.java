package self_study;

import java.util.Scanner;

interface Client{ //interface class
	void input(); //public+ abstract method
	void output();
	default void show() {  //default method
		System.out.println("This is a default method of interface class");
	}
	static void display() {  //static method
		System.out.println("This is a static method of interface class");
	}
}

class Developer implements Client{
	String name; int age;
	
	@Override
	public void input() {  //this method must be public as interface method is public
		Scanner r=new Scanner(System.in);
		
		System.out.println("Enter User Name:");
		name=r.nextLine();
		
		System.out.println("Enter User Age:");
		age=r.nextInt();
	}
	
	@Override
	public void output() { //this method must be public as interface method is public
		System.out.println("Name = "+name+"\nAge= "+age);
	}
}
public class Interface {

	public static void main(String[] args) {
		//interface class can use as a reference but can't create a object of interface class
		Client obj=new Developer();  //here reference can be interface class Client or Developer
		obj.input();
		obj.output();
		obj.show();
		Client.display();

	}

}
