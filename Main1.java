package by.training.tutor1.main;

import java.util.Scanner;//импортируем пакет java.util в котором есть класс Scanner

public class Main1 {
	public static void main(String[] args) {


Scanner	enter = new Scanner(System.in);//создаем объект(все что угодно кроме НЕ примитивная переменная) - имя объекта enter
									   // new это оператор с помощью которого создаются новые объекты! типом объекта считается класс!
                                       // типа объекта - класс Scaner
									   //Итак объект enter становится новым объектом класса Scanner, вызывающий стандартный метод, кот. читает из потока 
System.out.print("Введите имя: ");//после print {ln} стаивим чтобы не переводить курсор
String name = enter.nextLine();//метод исп.для введения строки
System.out.println("Hello " +name);

System.out.println();
System.out.print("введите а= ");
double a = enter.nextDouble();//исп.для чисел (чтобы посмотреть что может метод после объекта поставить (.))
System.out.print("введите b= ");
double b = enter.nextDouble();
System.out.print("введите c= ");
double c = enter.nextDouble();
double z;
		z=(b+Math.sqrt(Math.pow(b, 2)+4*a*c))/2*a-Math.pow(a, 3)+Math.pow(b, -2);
		System.out.println("z="+z);
		System.out.println("a, b, c, z");
		System.out.printf("%s  %s  %s  %s", a, b, c, z);//для ввода значений переменных может использоваться такая форма
														   //%s - заполнитель	
	}
}
