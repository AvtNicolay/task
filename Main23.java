//найти сумму квадратов первых 100 чисел
package by.training.tutor1.main;

public class Main23 {
	public static void main(String[] args) { 
	
	double i;
	double x;

	x=0;
	for (i=1; i<=100; i++) {x=x+Math.pow(i, 2);} 
	
	System.out.println("Итого:   " +x);
	}

	
}
