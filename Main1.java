package by.training.tutor1.main;

import java.util.Scanner;//����������� ����� java.util � ������� ���� ����� Scanner

public class Main1 {
	public static void main(String[] args) {


Scanner	enter = new Scanner(System.in);//������� ������(��� ��� ������ ����� �� ����������� ����������) - ��� ������� enter
									   // new ��� �������� � ������� �������� ��������� ����� �������! ����� ������� ��������� �����!
                                       // ���� ������� - ����� Scaner
									   //���� ������ enter ���������� ����� �������� ������ Scanner, ���������� ����������� �����, ���. ������ �� ������ 
System.out.print("������� ���: ");//����� print {ln} ������� ����� �� ���������� ������
String name = enter.nextLine();//����� ���.��� �������� ������
System.out.println("Hello " +name);

System.out.println();
System.out.print("������� �= ");
double a = enter.nextDouble();//���.��� ����� (����� ���������� ��� ����� ����� ����� ������� ��������� (.))
System.out.print("������� b= ");
double b = enter.nextDouble();
System.out.print("������� c= ");
double c = enter.nextDouble();
double z;
		z=(b+Math.sqrt(Math.pow(b, 2)+4*a*c))/2*a-Math.pow(a, 3)+Math.pow(b, -2);
		System.out.println("z="+z);
		System.out.println("a, b, c, z");
		System.out.printf("%s  %s  %s  %s", a, b, c, z);//��� ����� �������� ���������� ����� �������������� ����� �����
														   //%s - �����������	
	}
}
