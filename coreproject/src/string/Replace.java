package string;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter your String");
		String s1=s.nextLine().toLowerCase();
		String s2=(s1.replaceAll("[aeiou]",""));
		System.out.println("new string is "+s2);

	}

}
