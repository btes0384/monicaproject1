package basic_programs;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks,choice;
		String grade;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your marks");
		marks=s.nextInt();
		choice=marks/10;
		switch(choice)
		{
		case 10:
		case 9:
		case 8:
			grade= "Excellent";
			break;
		case 7:
			grade="very good";
			break;
		case 6:
			grade="good";
			break;
		case 5:
		grade="Average";
		break;
		case 4:
			grade="poor";
			break;
		default:
			grade="fail";
			break;
		}
		System.out.println(grade);
		
		

	}

}
