package self_study;
import java.util.Scanner;

class Scan{//super class
	Scanner input =new Scanner(System.in);
	int a,b,sum,multiply;
	double x,y,sub,division;
	void scan() {
	System.out.println("Enter integer value a & b : ");
	a=input.nextInt();
	b=input.nextInt();
	System.out.println("Enter double  value x & y  : ");
	x=input.nextDouble();
	y=input.nextDouble();
	}
}
class AddSub extends Scan{//sub1 class
	void add() {
		sum=a+b;
		System.out.println("Addition of two integer value: "+sum);
	}
	void sub() {
		sub=x-y;
		System.out.println("Substraction of two double value: "+sub);
	}
}
class MultiDivi extends AddSub{//sub2 class
	void multi() {
		multiply=a*b;
		System.out.println("Multiplication of two integer value: "+multiply);
	}
	void divi() {
		division=x/y;
		System.out.println("Division of two double value: "+division);
	}
}

public class Multilevel_Inheritance {

	public static void main(String[] args) {
		MultiDivi r=new MultiDivi();
		r.scan();
		r.add(); r.sub(); r.multi(); r.divi();

	}

}
