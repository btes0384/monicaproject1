package string;

import java.util.Scanner;

public class MobileNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count;
		Scanner s=new Scanner(System.in);
		System.out.println("enter your mobile no");
		String s1=s.nextLine();
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			count=1;
			if((s2.indexOf(s1.charAt(i))==-1))
					{
				for(int j=i+1;j<s1.length();j++)
				{
					if(s1.charAt(i)==s1.charAt(j))
					{
						count++;
					}
				}
				System.out.println(s1.charAt(i)+"is"+count+"no of times");
				s2=s2+s1.charAt(i);
					}
		}


	}

}
