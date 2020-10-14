//найти произведение квадратов первых 200 чисел
package by.training.tutor1.main;

public class Main24 {
	public static void main(String[] args) { 
	
	double i;
	double x0, x;
	
	//прямой счет
	x0=0;
	x=1;
	for (i=1; i<=200; i++) {x=x0+x*Math.pow(i, 2);} 
	System.out.println("200!)^2:   " +x);
	System.out.println("нет возможности представить число!");
	
	double x1=1;
	for (i=1; i<=90; i++) {x1=x0+x1*Math.pow(i, 2);}
	System.out.println("90!^2= "+x1);
	double x2;
	x2=Math.log10(x1);
	System.out.println("x2= "+x2);//появилась первая степень
	int x3= (int) x2;
	System.out.println("степень 90!^2= "+x3);
	double x4;
	x4=x1/(1*Math.pow(10, x3));
	System.out.println("первый разряд  " +x4);
	int x5= (int) x4;//появилось значение 1-го разряда
	System.out.println("90!^2= "+x5+" *10^"+x3);
	
	double x11=1;
	for (i=91; i<=140; i++) {x11=x1*Math.pow(i, 2);}
	System.out.println("(91-140)!^2= "+x11);
	double x12;
	x12=Math.log10(x11);
	System.out.println("x12= "+x12);//появилась первая степень
	int x13= (int) x12;
	System.out.println("степень (91-140)!^2= "+x13);
	double x14;
	x14=x11/(1*Math.pow(10, x13));
	System.out.println("первый разряд  " +x14);
	int x15= (int) x14;//появилось значение 1-го разряда
	System.out.println("(91-140)!= "+x15+" *10^"+x13);
	
	double x21=1;
	for (i=141; i<=180; i++) {x21=x1*Math.pow(i, 2);}
	System.out.println("(141-180)!^2= "+x21);
	double x22;
	x22=Math.log10(x21);
	System.out.println("x22= "+x22);//появилась первая степень
	int x23= (int) x22;
	System.out.println("степень (141-180)!^2= "+x23);
	double x24;
	x24=x21/(1*Math.pow(10, x23));
	System.out.println("первый разряд  " +x24);
	int x25= (int) x24;//появилось значение 1-го разряда
	System.out.println("(141-180)!^2= "+x25+" *10^"+x23);
	
	double x31=1;
	for (i=181; i<=200; i++) {x31=x1*Math.pow(i, 2);}
	System.out.println("(181-200)!^2= "+x31);
	double x32;
	x32=Math.log10(x31);
	System.out.println("x32= "+x32);//появилась первая степень
	int x33= (int) x32;
	System.out.println("степень (181-200)!^2= "+x33);
	double x34;
	x34=x31/(1*Math.pow(10, x33));
	System.out.println("первый разряд  " +x34);
	int x35= (int) x34;//появилось значение 1-го разряда
	System.out.println("(181-200)!^2= "+x35+" *10^"+x33);
	
	int xk;
	int sxk;
	xk= x5*x15*x25*x35;//итоговое число
	sxk = x3+x13+x23+x33;//итоговый разряд
	System.out.println();
	System.out.println("200!^2= "+xk+" *10^"+sxk);

			
	}
	}
