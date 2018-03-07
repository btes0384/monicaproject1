package basic_programs;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number");
	a=s.nextInt();
	if(a%2==0)
	{
		System.out.println("entered no is even");
	}
	else
	{
		System.out.println("entered no is odd");
	}

	}

}
