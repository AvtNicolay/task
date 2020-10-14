//задача 4. иоменять местави число 3 разряда целой части с 3 разрядами дробной ХХХ.УУУ-> ууу.ххх
package by.training.tutor1.main;

	import java.util.Scanner;

	public class Main3 {

	public static void main(String[] args) { 
		Scanner	enter = new Scanner(System.in);
		System.out.print("x= ");
		double x= enter.nextDouble();
		int x1 = (int)x;//целая часть исх.
		System.out.print("целая часть x= " + x1);
		double x2;
		x2=x-x1;//дробная часть исх.
		System.out.print("дробная часть x= " + x2);
		double x4=x1;
		x4=x4/1000;
		double x3;
		x3=(x2*1000)+(x4);
		System.out.print("инвертированный x= " + x3);
		
			
	}
	}	

