        /*     m=sqrt((6*t*t)/(sqrt(t)+x))  */
package self_study;

import java.util.Scanner;

interface part1{
	double value(double t, double x);
}

interface part2{
	void result(double result);
}

class multiple implements part1,part2{

	
	@Override
	public double value(double t, double x) {
		
		return Math.sqrt((6*t*t)/(Math.sqrt(t)+x));
	}

	@Override
	public void result(double result) {
		
		System.out.println("The Result of m= "+result);
	}

}
public class Multiple_Inheritance {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		//input values of t & x
		System.out.println("Enter value of t: ");
		double t=input.nextDouble();
		
		System.out.println("Enter value of x: ");
		double x=input.nextDouble();
		
		multiple r=new multiple();
		double finalresult=r.value(t,x);
		
		r.result(finalresult);

	}

}
