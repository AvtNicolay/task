//даны два числа н-ти цифры которые входят как в 1-е так и 2-е число
package by.training.tutor1.main;

import java.util.Scanner;

public class Main27 {
	public static void main(String[] args) { 
	
	Scanner	enter = new Scanner(System.in);
	System.out.print("x= ");
	double x= enter.nextDouble();	
	System.out.print("y= ");
	double y= enter.nextDouble();	
	
	double as, c;
	if (x>y) {as=x; c=x-y;}//определяем что больше х или у и их разность
	else     {as=y; c=y-x;}
	
	double n=100;//возможное количество разрядов
	
	for (int h=0; h<=1; h++)  {as=as-Math.abs(h*c);//условие расчета x и y
		
	double i;
	double i1=0;
	double k=0;
	double a;
	a=as;
	for (i=1; i<=n; i++) {k=a*(Math.pow(10, -i)); 
	if (k>0 & k<1) n=i;}
	i1=i-1; 
	System.out.println("число разрядов a (в) = " +i1);
	//----------------------------//-------------------------
	
	double i2, i3;
	double k1, k3;
	System.out.println("разряд      значение");
	
	i2=i1-1; k1=a*(Math.pow(10, -i2)); int k2 = (int) k1; a=a-k2*(Math.pow(10, i2));
	System.out.println(" [" +i1+ "]      " +k2);
	
	for (i2=i1-1; i2>=1; i2--) {i3=i2+1; k3=a*(Math.pow(10, -(i2-1))); int k4 = (int) k3; a=a-k4*(Math.pow(10, (i2-1)));    
	System.out.println(" [" +i2+ "]      " +k4);} 
		
							  } 
	}
	}