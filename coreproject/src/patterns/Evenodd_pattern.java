package patterns;

public class Evenodd_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(j%2);
			}
			System.out.println();
		}

	}

}
