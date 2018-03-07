package basic_programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,fact=1,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number:");
		n=s.nextInt();
		for(i=2;i<=n;i++)
			fact*=i;
		System.out.println("Factorial of number is:"+fact);

	}

}
