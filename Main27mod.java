//���� ��� ����� �-�� ����� ������� ������ � 1-� ��� � 2-� �����
package by.training.tutor1;

import java.util.Scanner;

public class Main27mod {
	public static void main(String[] args) {
		double x;// ������ �����
		double y;// ������ �����
		double n1;// ����� �������� ������� �����
		double n2;// ����� �������� ������� �����
		double a1;// ������ ����� ������� �����
		double b1;// ������ ����� ������� �����
		double a2;// ��������� ����� 1-�� �����
		double b2;// ������ ����� ������� �����

		x = enterFromConsole("x=");// ���� � ������� 1-�� �����
		y = enterFromConsole("y=");// ���� � ������� 2-�� �����
		n1 = calcN(x);// ������ �������� 1-�� �����
		n2 = calcN(y);// ������ �������� 2-�� �����
		System.out.println("������      ��������");
		a1 = firstdecNumber(n1, x);// ������ ����� 1-�� ������� 1-�� �����
		lastDecNumber(n1, a1);// ������ ��������� �������� 1-�� �����
		System.out.println();
		b1 = firstdecNumber(n2, y);// ������ ����� 1-�� ������� 1-�� �����
		lastDecNumber(n2, b1);// ������ ��������� �������� 2-�� �����

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
		return k4;// �������� ������� ��� ������� ������� (5987-5*1000=987)
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
		double n = 100;// ��������� ���������� ��������
		double i;
		double i1 = 0;
		double k = 0;
		for (i = 1; i <= n; i++) {
			k = value1 * (Math.pow(10, -i));
			if (k > 0 & k < 1)
				n = i;
		}
		i1 = i - 1;
		System.out.println("����� �������� x, y = " + i1);
		return i1;
	}

	public static double enterFromConsole(String message) { // � ������� ��������� ������� ���������� � �����
		// �������� �������� massage ��������� ���
//����� enterFromConsole � ������� �������� ���-�� ��� (�.�. void �� ��������, �������� int!)
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double value;
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			sc.next();// ������� �������� � ������
			System.out.print(message);
		}
		value = sc.nextDouble();
		return value;// ���������� ��������� ������ ���� int
	}

}