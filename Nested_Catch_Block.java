package self_study;

public class Nested_Catch_Block {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			try {
				String a=null;
				System.out.println(a.toLowerCase());
			}catch(NullPointerException n) {
				System.out.println(n);
			}
			
			
		}
		System.out.println("Main Method Ended");
	}

}
