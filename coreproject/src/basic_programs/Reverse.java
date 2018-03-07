package basic_programs;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,rev=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number");
		n=s.nextInt();
		while(n!=0)
		{
			rev=rev*10;
			rev=rev+n%10;
			n=n/10;
		}
		System.out.println("reverse is"+rev);


	}
	}


