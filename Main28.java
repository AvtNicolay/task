//для каждого натурального числа от m до n вывести все делители кроме 1 и самого числа
package by.training.tutor1.main;

import java.util.Scanner;

public class Main28 {
	public static void main(String[] args) { 
	
	Scanner	enter = new Scanner(System.in);
	System.out.print("начало интервала n= ");
	double n= enter.nextDouble();	
	System.out.print("конец интервала m= ");
	double m= enter.nextDouble();	
	double i;
	for (i=n; i<=m; i++) {
	System.out.print("["+i+"]");
		if (i!=2 & i%2==0) {System.out.print("/2, ");}
		if (i!=3 & i%3==0) {System.out.print("/3, ");}
		if (i!=4 & i%4==0) {System.out.print("/4, ");}
		if (i!=5 & i%5==0) {System.out.print("/5, ");}
		if (i!=6 & i%6==0) {System.out.print("/6, ");}
		if (i!=7 & i%7==0) {System.out.print("/7, ");}
		if (i!=8 & i%8==0) {System.out.print("/8, ");}
		if (i!=9 & i%9==0) {System.out.print("/9, ");}
		System.out.println();
	}
		
	}
	}