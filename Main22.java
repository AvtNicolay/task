//y=x ��� x>2; y=-x ��� x<=2 �� ������� [a, b] � ����� h
package by.training.tutor1.main;

import java.util.Scanner;

public class Main22 {
	public static void main(String[] args) { 
	//��������� ������������ ����� ��������� [a, b]
	System.out.println("������� �������� ����� [a,b], ��� ������ ����������� ������� a>b");	
	System.out.println("������ a=-20, b=10; a=-5, b=5; a=1, b=10");
	Scanner	enter = new Scanner(System.in);
	System.out.print("a= ");
	double a= enter.nextDouble();
	System.out.print("b= ");
	double b= enter.nextDouble();
	System.out.print("h= ");
	double h= enter.nextDouble();
	
	if (a>b) {System.out.println("������� ������ ��������");return;}//������ ����������� ������� b-a>a-b; => � ����� for ������������ ������ i++, ������� i-- �� ���������������
	
	double x,y;
	double n1;
	n1=(a-b)/h;
	int n = (int)n1;//����� ����� (���������� �����)
	n= Math.abs(n);// �������� ������
	double k=n*h; 
	int i;
	
	
	i=0; x=a; //�.�. ����������� �������
	if  (x>2) {y=x;}
	else y=-x;
	System.out.println("i= " +i+ "  x= "+x+"  y= " +y);
	
	for (i=1; i<=n; i++) {x=x+h; 
	if (x>2) {y=x;}
	else {y=-x;}
	System.out.println("i= " +i+"  x= "+x+"   y= " +y);}
	double bn;
	bn=a+h*n;
		
	if (b !=bn)// ����������� ������� ���� �� �������� ������ �.�. n ������ ���� �����, � b!=bn !! 
	           // ��� ��������� ��������� ������� �������������� � i=i+1 
	{i=n+1; x=b;
	if (b>2) {y=x;} //�.�. ����������� �������
	else {y=-x;}
	System.out.println("i= " +i+"  x= "+x+"   y= " +y);
	}
	else return;
	System.out.println("bn= " +bn);
	}
}
