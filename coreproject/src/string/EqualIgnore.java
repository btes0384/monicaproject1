package string;

import java.util.Scanner;

public class EqualIgnore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1="City Chandigarh is Beautiful";
		System.out.println("enter string ");
		String s2=s.nextLine();
if(s1.equalsIgnoreCase(s2))
{
	System.out.println("same");
}
else
{
	System.out.println("different");
	}
	}
	}

