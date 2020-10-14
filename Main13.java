//есть точки А(х1,у1), B(x2,y2), C(x3,y3) лежать ли точки на одной прямой
package by.training.tutor1.main;

import java.util.Scanner;

public class Main13 {
	public static void main(String[] args) { 
	Scanner	enter = new Scanner(System.in);
	System.out.print("A x1= ");
	double x1= enter.nextDouble();
	System.out.print("A y1= ");
	double y1= enter.nextDouble();
	System.out.print("B x2= ");
	double x2= enter.nextDouble();
	System.out.print("B y2= ");
	double y2= enter.nextDouble();
	System.out.print("C x3= ");
	double x3= enter.nextDouble();
	System.out.print("C y3= ");
	double y3= enter.nextDouble();
	double k;
	double b;
	k=(y2-y1)/(x2-x1);
	b=y2-k*x2;
	double y31;//верное значение С(у3)
	y31=x3*k+b;
	double z;//вычисляем верное и введенное значение
	z=y31-y3; z=z*z;//квадрат чтобы был модуль если у31=у3 то будет 0, 0*0 все навно ноль!
	System.out.println("к= " +k);
	 System.out.println("b= " +b);
	 System.out.println("y31= " +y31);
	if (z>0) {System.out.println("Точки не лежат на одной прямой");}
	else System.out.println("точки лежат на одной прямой");

	}

}
