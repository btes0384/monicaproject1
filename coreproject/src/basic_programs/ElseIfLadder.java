package basic_programs;

import java.util.Scanner;

public class ElseIfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks;
		Scanner s=new Scanner(System.in);
		System.out.println("enter your marks");
		marks=s.nextInt();{
		if(marks>=85)
			System.out.println("Excellent");
			else if(marks>=70&&marks<85)
				System.out.println("very good");
			else if(marks>=60&&marks<70)
				System.out.println("good");
			else if(marks>=50&&marks<60)
				System.out.println("Average");
			else if (marks>=40&&marks<50)
				System.out.println("poor");
			else if (marks>=30&&marks<40)
				System.out.println("fail");
	}

}}
