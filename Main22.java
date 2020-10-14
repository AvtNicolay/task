//y=x при x>2; y=-x при x<=2 на участке [a, b] с шагом h
package by.training.tutor1.main;

import java.util.Scanner;

public class Main22 {
	public static void main(String[] args) { 
	//проверяем правильность ввода интервала [a, b]
	System.out.println("Введите интервал счета [a,b], где всегда соблюдается условие a>b");	
	System.out.println("Пример a=-20, b=10; a=-5, b=5; a=1, b=10");
	Scanner	enter = new Scanner(System.in);
	System.out.print("a= ");
	double a= enter.nextDouble();
	System.out.print("b= ");
	double b= enter.nextDouble();
	System.out.print("h= ");
	double h= enter.nextDouble();
	
	if (a>b) {System.out.println("неверно указан интервал");return;}//всегда соблюдается условие b-a>a-b; => в цикле for используется только i++, вариант i-- не рассматривается
	
	double x,y;
	double n1;
	n1=(a-b)/h;
	int n = (int)n1;//целая часть (количество шагов)
	n= Math.abs(n);// получаем модуль
	double k=n*h; 
	int i;
	
	
	i=0; x=a; //т.к. неравенство строгое
	if  (x>2) {y=x;}
	else y=-x;
	System.out.println("i= " +i+ "  x= "+x+"  y= " +y);
	
	for (i=1; i<=n; i++) {x=x+h; 
	if (x>2) {y=x;}
	else {y=-x;}
	System.out.println("i= " +i+"  x= "+x+"   y= " +y);}
	double bn;
	bn=a+h*n;
		
	if (b !=bn)// проверяется условие весь ли интервал выбран т.к. n должно быть целым, и b!=bn !! 
	           // при равенстве последняя строчка продублируется с i=i+1 
	{i=n+1; x=b;
	if (b>2) {y=x;} //т.к. неравенство строгое
	else {y=-x;}
	System.out.println("i= " +i+"  x= "+x+"   y= " +y);
	}
	else return;
	System.out.println("bn= " +bn);
	}
}
