public class 문제08 {
	static String method5(String s)
	{
		String result = "";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				result+=s.charAt(i);
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
				result+=(char)(s.charAt(i)-32);
				
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = method5("Hello Java");
		System.out.println(s);
	}

}
