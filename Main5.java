//принадлежит ли точка А(x,y) фигуре
package by.training.tutor1.main;

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) { 
	Scanner	enter = new Scanner(System.in);
	System.out.print("x= ");
	int x= enter.nextInt();
	System.out.print("y= ");
	int y= enter.nextInt();
int x1;
int x2;
int y1;
int y2;

int a, b, c;
boolean ans;
x1=x;
y1=y;	
if (y1>=0 & y1<=4 & x1>=-2 & x1<=2) a=1;
else a=0;
	x2=x;
	y2=y;
	if (y2>=-3 & y2<=0 & x2>=-4 & x2<=4) b=1;
else b=0;
c=a+b;
    if (c>0) {ans=true;
    System.out.println("Answer= " +ans);}
    else 	{ans=false;
    System.out.println("Answer= " +ans);} 		
	}
}
