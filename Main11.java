//даны 2 угла треугольника. существует ли треугольник
//если да, прямоугольный ли он
package by.training.tutor1.main;

import java.util.Scanner;

public class Main11 {
	public static void main(String[] args) { 
	Scanner	enter = new Scanner(System.in);
	System.out.print("a= ");
	double a= enter.nextDouble();
	System.out.print("b= ");
	double b= enter.nextDouble();
double c;
c=180-a-b;
if (c>0) System.out.println("Треугольник существует");
else {System.out.println("Треугольник не существует"); return;}//досрочно выходим из программы
if (a>90 & a<90 & b<90 & b>90 & c<90 & c>90) System.out.println("Треугольник не прямоугольный");
else System.out.println("Треугольник прямоугольный");

	}
}
