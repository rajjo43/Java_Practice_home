package self_study;
interface client1{
	void webdesign();
	void webdevelope();
}
//As this class couldn't implement 2 method of interface class,so it became abstract class
abstract class techDesign implements client1{ 
	
	@Override
	public void webdesign() {
		System.out.println("The website must be aesthetic, there should be anime character");
		
	}
}

class techDevelope extends techDesign{

	@Override
	public void webdevelope() {
		System.out.println("HTML, JavaScript,CSS");
		
	}
	
}

public class Interface_Method {

	public static void main(String[] args) {
		techDevelope r=new techDevelope();
		r.webdesign();
		r.webdevelope();
	}

}
