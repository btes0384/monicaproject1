package basic_programs;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double circum,radius,sides,area;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the radius of circle:");
		radius=s.nextDouble();
		circum=2*radius*radius;
		System.out.println("circumfernce of circle:"+circum);
		System.out.println("enter side of sequare:");
		sides=s.nextDouble();
		area=sides*sides;
		System.out.println("area of sequence:"+area);


	}

}
