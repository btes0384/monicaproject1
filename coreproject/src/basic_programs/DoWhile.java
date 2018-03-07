package basic_programs;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c='n';
		Scanner s=new Scanner(System.in);
		do
		{
			if(c!='y')
			{
		System.out.println("welcome to event");
		}
			if(c=='y')
			{
		System.out.println("congratulation there is a coupen for you");
			}
		System.out.println("press y to continue/other character to exit");
		
		c= s.next().charAt(0);
		}while(c=='y');

	}

}
