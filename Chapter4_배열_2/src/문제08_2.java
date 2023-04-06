
public class 문제08_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] c = new char[10];
		
		for(int i=0;i<c.length;i++)
		{
				c[i]=(char)((Math.random()*26)+65);
		}

		for(char cc: c)
		{
			System.out.print(cc);
		}

	}

}
