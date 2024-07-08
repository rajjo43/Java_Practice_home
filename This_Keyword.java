package self_study;

class Key{
	
	Key(){  //default constructor
		System.out.println(this);  //System.out.println(obj)--->same output
		System.out.println("This is a default constructor");
	}
	//instance variable
	int a; 
	
	Key(int a){  //local variable
		this();  //calling default constructor
		this.a=a;  //if we write (a=a;)  the result a=0; because it will take value of instance variable
		System.out.println("a= "+a);
	}
}

class Key2{
	Key2(){
		this(200);  //calling parametrized constructor
	}
	Key2(int x){
		System.out.println("x= "+x);
	}
}
public class This_Keyword {

	public static void main(String[] args) {
		Key obj=new Key(100);
		System.out.println(obj);
		Key2 obj2=new Key2();
	}
}
