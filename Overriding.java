package self_study;
class intro{
	void show() {
		System.out.println("Hi! This is Rajwshree");
	}
}

class descript extends intro{
	@Override
	void show() {
		super.show();  //if we don't use this line super class show method will not print out
		System.out.println("I am learning Java OOP");
	}
}


public class Overriding {

	public static void main(String[] args) {
		intro obj=new descript(); //reference can be intro or descript
		obj.show();

	}

}
