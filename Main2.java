package by.training.tutor1.main;

import java.util.Scanner;

public class Main2 {

public static void main(String[] args) { //public static - спецификаторы языка. public- доступ к методу откуда угодно 
	Scanner	enter = new Scanner(System.in);
	System.out.print("x= ");
	double x = enter.nextDouble();
	System.out.print("y= ");
	double y = enter.nextDouble();
	x=x*3.14158/180;
	y=y*3.14158/180;
double z1;
double z;
z1=Math.sin(x);
z=(Math.sin(x)+Math.cos(y))/(Math.sin(x)-Math.cos(y));
System.out.println("z1= "+z1);
System.out.println("z= "+z);
	
} 
}
