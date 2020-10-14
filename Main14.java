//дано прямоугольное отв. А*В. пройдет ли кирпич с размерами x*y*z
package by.training.tutor1.main;

import java.util.Scanner;

public class Main14 {
	public static void main(String[] args) { 
	Scanner	enter = new Scanner(System.in);
	System.out.print("A= ");
	double a= enter.nextDouble();
	System.out.print("B= ");
	double b= enter.nextDouble();
	System.out.print("x= ");
	double x= enter.nextDouble();
	System.out.print("y= ");
	double y= enter.nextDouble();
	System.out.print("z= ");
	double z= enter.nextDouble();
	double max;
	double min;
	double maxK;
	double midK;
	double minK;
	if (a>b) {max=a; min=b; System.out.println("Большая сторона отверстия - А=" +a+ ";  Меньшая сторона отверстия - В=" +b);}
	else max=b; min=a; System.out.println("Большая сторона отверстия - B=" +b+ ";  Меньшая сторона отверсстия - A=" +a);
	     if (x>y & x>z) {maxK=x; System.out.println("Большая сторона кирпича - х=" +x);}
	else if (y>x & y>z) {maxK=y; System.out.println("Большая сторона кирпича - y=" +y);}
	else {maxK=z; System.out.println("Большая сторона кирпича - z=" +z);}
	
	     if (x<y & x<z) {minK=x; System.out.println("Меньшая сторона кирпича - х=" +x);}
	else if (y>x & y>z) {minK=y; System.out.println("Меньшая сторона кирпича - y=" +y);}
	else {minK=z; System.out.println("Меньшая сторона кирпича - z=" +z);}
	     
	     if (x>minK & x<maxK) {midK=x; System.out.println("Средняя сторона кирпича - х=" +x);}
	 else if (y>minK & y<maxK) {midK=y; System.out.println("Средняя сторона кирпича - y=" +y);}
	 else {midK=z; System.out.println("Средняя сторона кирпича - z=" +z);}
	 
	     if (maxK<min & midK<min) {System.out.println("Кирпич проходит любой стороной"); return;}
	     
	     if (minK>min) {System.out.println("Не проходит" +min +"<"+minK); return;}
	else if (midK>max) {System.out.println("Не проходит" +midK +">"+max); return;}
	else    {System.out.println("Кирпич проходит");} 
	    
	}
}
