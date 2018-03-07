package array;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n=5,item,f,l,m;
		int []a=new int[n];
		Scanner s=new Scanner(System.in);
		System.out.println("enter the elements in array:");
		for(i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter the search value:");
		item=s.nextInt();
		f=0;
		l=n-1;
		m=(f+l)/2;
		while(f<=l)
		{
			if(a[m]<item)
			{
				f=m+1;
			}
			else if(a[m]==item)
			{
				System.out.println(item+" found at loc "+(m+1)+".");
				break;
			}
			else
			{
				l=m-1;
				
			}
			m=(f+l)/2;
		}
		if(f>l)
System.out.println(item+" is not found");
	

	}

}
