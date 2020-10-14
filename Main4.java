//время в секундах перевести в формат ЧЧ.мм.сс
package by.training.tutor1.main;

import java.util.Scanner;

public class Main4 {

public static void main(String[] args) { 
	Scanner	enter = new Scanner(System.in);
	System.out.print("x= ");
double x= enter.nextDouble();
double h;
h=x/3600;
int h1 = (int)h;//целая часть исх.
double m;
m=(x-h1*3600)/60;
int m1 = (int)m;//целая часть исх.
double c;
c=x-(h1*3600+m1*60);
System.out.println(h1+"."+m1+"."+c);
}
}
