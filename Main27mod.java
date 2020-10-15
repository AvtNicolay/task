//даны два числа н-ти цифры которые входят в 1-е так и 2-е число
package by.training.tutor1;

import java.util.Scanner;

public class Main27mod {
	public static void main(String[] args) {
		double x;// первое число
		double y;// второе число
		double n1;// число разрядов первого числа
		double n2;// число разрядов второго числа
		double a1;// первая цифра первого числа
		double b1;// первая цифра первого числа
		double a2;// остальные цифры 1-го числа
		double b2;// первая цифра первого числа

		x = enterFromConsole("x=");// ввод с консоли 1-го числа
		y = enterFromConsole("y=");// ввод с консоли 2-го числа
		n1 = calcN(x);// расчет разрядов 1-го числа
		n2 = calcN(y);// расчет разрядов 2-го числа
		System.out.println("разряд      значение");
		a1 = firstdecNumber(n1, x);// расчет цифры 1-го разряда 1-го числа
		lastDecNumber(n1, a1);// расчет остальных разрядов 1-го числа
		System.out.println();
		b1 = firstdecNumber(n2, y);// расчет цифры 1-го разряда 1-го числа
		lastDecNumber(n2, b1);// расчет остальных разрядов 2-го числа

	}

	public static double firstdecNumber(double i1, double k1)  {
		double i2;
		double k2;
		double k4;
		i2 = i1 - 1;
		k2 = k1 * (Math.pow(10, -i2));
		int k3 = (int) k2;
		k4 = k1 - k3 * (Math.pow(10, i2));
		System.out.println(" [" + i1 + "]      " + k3);
		return k4;// передача остатка без первого разряда (5987-5*1000=987)
	}

	public static void lastDecNumber(double i3, double k5) {

		double i4;
		double i5;
		double k6;
		double k8;
		for (i4 = i3 - 1; i4 >= 1; i4--) {
			i5 = i4 + 1;
			k6 = k5 * (Math.pow(10, -(i4 - 1)));
			int k7 = (int) k6;
			k5 = k5 - k7 * (Math.pow(10, (i4 - 1)));
			System.out.println(" [" + i4 + "]      " + k7);

		}
	}

	public static double calcN(double value1) {
		double n = 100;// возможное количество разрядов
		double i;
		double i1 = 0;
		double k = 0;
		for (i = 1; i <= n; i++) {
			k = value1 * (Math.pow(10, -i));
			if (k > 0 & k < 1)
				n = i;
		}
		i1 = i - 1;
		System.out.println("число разрядов x, y = " + i1);
		return i1;
	}

	public static double enterFromConsole(String message) { // в скобках параметры которые передаются в метод
		// передаем параметр massage строковый тип
//метод enterFromConsole с консоли передает что-то вне (т.е. void не подходит, подходит int!)
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double value;
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			sc.next();// смотрим значение в потоке
			System.out.print(message);
		}
		value = sc.nextDouble();
		return value;// возвращаем результат метода типа int
	}

}