//���� ������������� ���. �*�. ������� �� ������ � ��������� x*y*z
package by.training.tutor1.main;

import java.util.Scanner;

public class Main14 {
	public static void main(String[] args) { 
	Scanner	enter = new Scanner(System.in);
	System.out.print("A= ");
	double a= enter.nextDouble();
	System.out.print("B= ");
	double b= enter.nextDouble();
	System.out.print("x= ");
	double x= enter.nextDouble();
	System.out.print("y= ");
	double y= enter.nextDouble();
	System.out.print("z= ");
	double z= enter.nextDouble();
	double max;
	double min;
	double maxK;
	double midK;
	double minK;
	if (a>b) {max=a; min=b; System.out.println("������� ������� ��������� - �=" +a+ ";  ������� ������� ��������� - �=" +b);}
	else max=b; min=a; System.out.println("������� ������� ��������� - B=" +b+ ";  ������� ������� ���������� - A=" +a);
	     if (x>y & x>z) {maxK=x; System.out.println("������� ������� ������� - �=" +x);}
	else if (y>x & y>z) {maxK=y; System.out.println("������� ������� ������� - y=" +y);}
	else {maxK=z; System.out.println("������� ������� ������� - z=" +z);}
	
	     if (x<y & x<z) {minK=x; System.out.println("������� ������� ������� - �=" +x);}
	else if (y>x & y>z) {minK=y; System.out.println("������� ������� ������� - y=" +y);}
	else {minK=z; System.out.println("������� ������� ������� - z=" +z);}
	     
	     if (x>minK & x<maxK) {midK=x; System.out.println("������� ������� ������� - �=" +x);}
	 else if (y>minK & y<maxK) {midK=y; System.out.println("������� ������� ������� - y=" +y);}
	 else {midK=z; System.out.println("������� ������� ������� - z=" +z);}
	 
	     if (maxK<min & midK<min) {System.out.println("������ �������� ����� ��������"); return;}
	     
	     if (minK>min) {System.out.println("�� ��������" +min +"<"+minK); return;}
	else if (midK>max) {System.out.println("�� ��������" +midK +">"+max); return;}
	else    {System.out.println("������ ��������");} 
	    
	}
}
