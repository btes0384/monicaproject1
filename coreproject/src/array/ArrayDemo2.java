package array;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,m=3,n=4;
		int[][]arr=new int[m][n];
		Scanner s=new Scanner (System.in);
		System.out.println("enter your matrix");
		for(i=0;i<arr.length;i++)
		{
			for( j=0;j<arr[i].length;j++)
			{
				arr[i][j]=s.nextInt();
			}
			
		}
		for(i=0;i<arr.length;i++)
		{
			for( j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
		System.out.println();
		}


	}

	}

