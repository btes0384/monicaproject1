package basic_programs;

public class Trioseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3=1,n4,i,count=10;
		System.out.print(n1+" "+n2+" "+n3);
		for(i=3;i<count;i++)
		{
			n4=n1+n2+n3;
			System.out.print(" "+n4);
			n1=n2;
			n2=n3;
			n3=n4;
		}
	}

}
