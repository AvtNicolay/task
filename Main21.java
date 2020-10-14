//¬вести любое целое число n м сумма от 1 до n
package by.training.tutor1.main;

import java.util.Scanner;

public class Main21 {
	public static void main(String[] args) { 
	Scanner	enter = new Scanner(System.in);
	System.out.print("n= ");
	int n= enter.nextInt();
	int i;
	int s;
	s=0;
	for (i=1; i<=n; i++) {s=s+i;}
		System.out.println("сумма=" +s);
	}
}
