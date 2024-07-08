package self_study;

interface customer{
	int kg=5;  //variable is public+static+final
	void input(); //public+abstract
}

class seller implements customer{

	@Override
	public void input() {
		
		System.out.println("Rajjo need "+kg+" rice");
		
	}
	
}

public class Interface_Variable {

	public static void main(String[] args) {
		customer r=new seller();
		r.input();
		System.out.println(customer.kg);  //static variable
	}

}
