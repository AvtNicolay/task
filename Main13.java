//���� ����� �(�1,�1), B(x2,y2), C(x3,y3) ������ �� ����� �� ����� ������
package by.training.tutor1.main;

import java.util.Scanner;

public class Main13 {
	public static void main(String[] args) { 
	Scanner	enter = new Scanner(System.in);
	System.out.print("A x1= ");
	double x1= enter.nextDouble();
	System.out.print("A y1= ");
	double y1= enter.nextDouble();
	System.out.print("B x2= ");
	double x2= enter.nextDouble();
	System.out.print("B y2= ");
	double y2= enter.nextDouble();
	System.out.print("C x3= ");
	double x3= enter.nextDouble();
	System.out.print("C y3= ");
	double y3= enter.nextDouble();
	double k;
	double b;
	k=(y2-y1)/(x2-x1);
	b=y2-k*x2;
	double y31;//������ �������� �(�3)
	y31=x3*k+b;
	double z;//��������� ������ � ��������� ��������
	z=y31-y3; z=z*z;//������� ����� ��� ������ ���� �31=�3 �� ����� 0, 0*0 ��� ����� ����!
	System.out.println("�= " +k);
	 System.out.println("b= " +b);
	 System.out.println("y31= " +y31);
	if (z>0) {System.out.println("����� �� ����� �� ����� ������");}
	else System.out.println("����� ����� �� ����� ������");

	}

}
