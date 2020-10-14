//y=x*x+3*x+9 для x<=3, y=1/(x*x*x+6) для x>3
package by.training.tutor1.main;

import java.util.Scanner;

public class Main15 {
	public static void main(String[] args) { 
	Scanner	enter = new Scanner(System.in);
	System.out.print("x= ");
	double x= enter.nextDouble();
	double y;
	if (x<=3) {y=Math.pow(x, 2)+3*x+9;}
	else      {y=1/(Math.pow(x, 3)+6);}
	 System.out.println("x=" +x + "  y= " +y);

	}
}
