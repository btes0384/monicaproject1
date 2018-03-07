package array;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,temp,j,n=5;
		Scanner s=new Scanner(System.in);
		int[]arr=new int[n];
		System.out.println("enter all elemnets");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length-1;j++)
			{
			if(arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
		for(i=0;i<arr.length;i++)
		{
			System.out.println(+arr[i]);
		}

	}

}
