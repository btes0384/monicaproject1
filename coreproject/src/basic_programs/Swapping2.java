package basic_programs;

import java.util.Scanner;

public class Swapping2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner s=new  Scanner(System.in);
		System.out.println("number before swapping");
		System.out.println("enter any two numbers");
		a=s.nextInt();
		b=s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
System.out.println("numbaers after swapping");
System.out.println("a="+a);
System.out.println("b="+b);
	}

}
