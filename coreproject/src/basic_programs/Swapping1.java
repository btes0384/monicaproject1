package basic_programs;

import java.util.Scanner;

public class Swapping1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,temp=0;
		Scanner s=new  Scanner(System.in);
		System.out.println("number before swapping");
		System.out.println("enter any two numbers");
		a=s.nextInt();
		b=s.nextInt();
			temp=a;
			a=b;
			b=temp;
System.out.println("numbaers after swapping");
System.out.println("a="+a);
System.out.println("b="+b);

	}

}
