    /*       m=sqrt((6*t*t)/(sqrt(t)+x))      */

package self_study;

class Super{
	double part1;
	double Super(double t) {
		 return part1=t;
	}
}
class Sub1 extends Super{
	double Sub1(double t) {
	double getpart1=super.Super(t);
	double part2=Math.sqrt(6*part1*part1); //value of sqrt((6*t*t)
	return part2;
	}
}
class Sub2 extends Super{
	 double Sub2(double t,double x) {
		double getpart1=super.Super(t);
		double part3=Math.sqrt(Math.sqrt(t)+x); //value of sqrt((sqrt(t)+X))
		return part3;
	}
}

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		Sub1 obj1=new Sub1();
		Sub2 obj2=new Sub2();
		
		System.out.println("result m= "+((obj1.Sub1(2.5))/(obj2.Sub2(9.5, 2.2))));

	}

}
/*
import java.util.Scanner;

//Superclass Calculation
class Calculation {
 protected double t;
 protected double x;

 public void getInput() {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter value for t: ");
     t = scanner.nextDouble();
     System.out.print("Enter value for x: ");
     x = scanner.nextDouble();
 }
}

// Compute.java
public class Compute extends Calculation {

    public double calculateM() {
        double numerator = 6 * t * t;
        double denominator = Math.sqrt(t) + x;
        return Math.sqrt(numerator / denominator);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Compute compute = new Compute();
        compute.getInput();
        double result = compute.calculateM();
        System.out.println("The value of m is: " + result);
    }
}

*/
