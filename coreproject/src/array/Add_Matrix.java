package array;

import java.util.Scanner;

public class Add_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,n=2,m=2;
		int[][]arr1=new int[m][n];
		int[][]arr2=new int[m][n];
		int[][]add=new int[m][n];
		Scanner s=new Scanner(System.in);
		System.out.println("enter first matrix");
		for(i=0;i<arr1.length;i++)
		{
			for(j=0;j<arr1[i].length;j++)
			{
				arr1[i][j]=s.nextInt();
			}
		}
		System.out.println("enter second matrix");
		for(i=0;i<arr2.length;i++)
		{
			for(j=0;j<arr2[i].length;j++)
			{
				arr2[i][j]=s.nextInt();
			}
		}
		
		for(i=0;i<arr1.length;i++)
		{
			for(j=0;j<arr1[i].length;j++)
			{
				add[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("sum of matrix");
		for(i=0;i<arr1.length;i++)
		{
			for(j=0;j<arr1[i].length;j++)
			{
				System.out.print(add[i][j]+"\t");
			}
			System.out.println();
		}
	}

	
	}

