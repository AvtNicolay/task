//max{min(a, b) min(c, d)}
package by.training.tutor1.main;

import java.util.Scanner;

public class Main12 {
	public static void main(String[] args) { 
	Scanner	enter = new Scanner(System.in);
	System.out.print("a= ");
	int a= enter.nextInt();
	System.out.print("b= ");
	int b= enter.nextInt();
	System.out.print("c= ");
	int c= enter.nextInt();
	System.out.print("d= ");
	int d= enter.nextInt();
int minab;
int mincd;
	if (a<b) {minab=a; System.out.println("min(a, b)= " +a);}
	else {minab=b; System.out.println("min(a, b)= " +b);}
	if (c<d) {mincd=c; System.out.println("min(c, d)= " +c);}
	else {mincd=d; System.out.println("min(c, d)= " +d);}
int max;
	 if (a>b & a>c & a>d ) {max=a; System.out.println("Max= " +a);}
else if (b>a & b>c & b>d ) {max=b; System.out.println("Max= " +b);}
else if (c>a & c>b & c>d ) {max=c; System.out.println("Max= " +c);}
else if (d>a & d>b & d>c ) {max=d; System.out.println("Max= " +d);}
else System.out.println("Max не найден");
	}

}
