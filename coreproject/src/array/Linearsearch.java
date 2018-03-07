package array;

import java.util.Scanner;

public class Linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,n=6;
		int[] arr=new int[n];
		Scanner s=new Scanner(System.in);
		System.out.println("enter all elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("enter element to be found");
		x=s.nextInt();
		for(int i=0;i<arr.length;i++)
		{	
		if(arr[i]==x)
			{
				System.out.println("elemnts is found"+i);
				break;
			}
	}

}}