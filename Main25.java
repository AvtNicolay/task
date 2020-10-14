//дан ряд n-членов. н-ти сумму тех членов ряда, которая не превышает число некоторое число е
package by.training.tutor1.main;

import java.util.Scanner;

public class Main25 {
	public static void main(String[] args) { 
	
	Scanner	enter = new Scanner(System.in);
	System.out.print("n= ");
	double n= enter.nextDouble();	
	System.out.print("e= ");
	double e= enter.nextDouble();	
	
	double i;
	double an=0;
	double k;
	
	for (i=2; i<=n; i++) {
		k=1/(Math.pow(i, n));
		an=an+k;
		if (k<e) {System.out.println("an=  " +an); return;}
		
	} System.out.println("an=  " +an);
	
	}
	
}
