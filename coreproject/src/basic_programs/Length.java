package basic_programs;

import java.util.Scanner;

public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number:");
		num=s.nextInt();
		while(num>0)
		{
			count++;
			num=num/10;
		}
		System.out.println("lenth is "+count);

	}

}
