//example of how to create a class and it's object
package self_study;

class Demo{
	int a=23;String b="rajjo";
	void show() {
		System.out.println(a+" "+b);
	}
	
}
public class Object {

	public static void main(String[] args) {
	Demo r=new Demo(); //creating object of Demo class
	//another way to create object
	/*Demo r;
      r=new Demo(); */
	r.show();
    
	}

}
