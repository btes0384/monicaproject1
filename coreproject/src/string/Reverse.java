package string;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="";
		String s="City Chandigarh is Beautiful";
		String s1=new String("CITY CHNDIGARH IS BEAUTIFUL");
		for(int i=s.length()-1;i>=0;i--)
		{
			a=a+s.charAt(i);
		}
System.out.println(a);


	}

}
