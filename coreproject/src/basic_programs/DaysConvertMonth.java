package basic_programs;

import java.util.Scanner;

public class DaysConvertMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month,days,x;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no of days");
		x=s.nextInt();
		month=x/30;
		days=x%30;
		System.out.println("month are=" +month);
		System.out.println("days are=" +days);
		
	}

}
