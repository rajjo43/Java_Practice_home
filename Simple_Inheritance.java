package self_study;

class Student{//super class
	int roll ,marks;
	String name;
	void input() {
	System.out.println("Enter roll & marks: ");
	}
}

class Simple_Inheritance extends Student{//sub class

	void disp() {
		roll=2;marks=95;
		name="rajjo";
		System.out.println("name: "+name+"\nroll: "+roll+"\nmarks: "+marks);
	}
	public static void main(String[] args) {
		Simple_Inheritance r= new Simple_Inheritance();
		r.disp();
		r.input();
		
	}

}
