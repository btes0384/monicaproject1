package basic_programs;

public class Primelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag;
		for(int n=1;n<=100;n++)
		{
			flag=true;
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					flag=false;
					break;
				}
				if(flag==true)
				{
					System.out.print(n+" ");
					break;
				}
			
			
				System.out.println();
				
			}
		}

	}}


