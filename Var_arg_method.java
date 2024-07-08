            /*        variable-argument method       */
package self_study;

class Variable{
	void add(int ... a) {  //this means int[]a---->that is array
		int sum=0;
		for(int x:a) {
			sum=sum+x;
		}
		System.out.println("Summation of Numbers: "+sum);
		
	}
	
	void sub(int ... y) {  
		int sub=y[0];
		for(int i=1;i < y.length;i++) {
			sub=sub-y[i];
		}
		System.out.println("Substraction of Numbers: "+sub);
	}
	
	void multiply(int ... y) {  
		int mul=y[0];
		for(int i=1;i < y.length;i++) {
			mul=mul*y[i];
		}
		System.out.println("Multiplication of Numbers: "+mul);
	}
	
	void divi(int ... y) {  
		int divi=y[0];
		for(int i=1;i < y.length;i++) {
			divi=divi/y[i];
		}
		System.out.println("division of Numbers: "+divi);
	}
}

public class Var_arg_method {

	public static void main(String[] args) {
		Variable obj =new Variable();
		obj.add();
		obj.add(10);
		obj.add(10,20,30);
		obj.add(10,40,2,1);
		
		obj.sub(10);
		obj.sub(20,20,30);
		obj.sub(40,10,2,1);
		
		obj.multiply(10);
		obj.multiply(2,20,3);
		obj.multiply(40,10,2,1);
		
		obj.divi(10);
		obj.divi(40,20,2);
		obj.divi(40,10,2,1);

	}

}
