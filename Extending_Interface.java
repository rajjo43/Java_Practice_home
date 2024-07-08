      /*     p=sqrt((sqrt((24*t)/2))/(sqrt(x*t)+100))      */
package self_study;

import java.util.Scanner;

interface first{
	double part1(double t);
	default void show() {
		System.out.println("Default method can be used in interface");
	}
}

interface Second extends first{
	double part2(double t, double x);
	void Result(double result);
}

class Output implements Second{

	@Override
	public double part1(double t) {
		
		return Math.sqrt((24*t)/2);
	}

	@Override
	public double part2(double t, double x) {
		
		return Math.sqrt(x*t)+100;
	}

	@Override
	public void Result(double fresult) {
		System.out.println("Result of p= "+fresult);
		
	}
	
}
public class Extending_Interface {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		
		System.out.println("Enter t: ");
		double t=r.nextDouble();
		
		System.out.println("Enter x: ");
		double x=r.nextDouble();
		
		Output obj=new Output();
		double result=Math.sqrt(obj.part1(t)/obj.part2(t, x));
		
		obj.Result(result);
		obj.show();
	}

}
