package self_study;

class throwdemo{
	void div(int a,int b) throws ArithmeticException {
	if(b==0){
		throw new ArithmeticException();
	}else {
		int c=a/b;
		System.out.println(c);
	}
  }
}

public class Throw_Throws {

	public static void main(String[] args)  {
		throwdemo obj =new throwdemo();
		
		try {
			obj.div(20,0);
		}catch(Exception e) {
			System.out.println("b value is zero");
		}

	}

}
