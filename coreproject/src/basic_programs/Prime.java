package basic_programs;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		boolean flag=true;
		Scanner s=new Scanner(System.in);
		System.out.println("Ënter any number:");
		n=s.nextInt();
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=false;
			}
		}
		if(flag==true) {
			System.out.println("number is prime");
			
		}
		else
		{
			System.out.println("number is not prime");
		}

	}

}
