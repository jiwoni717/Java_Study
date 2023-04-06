
public class 문제02_1 {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)
					continue; // 2차 for문만 제어
				System.out.println("i = "+i+", j = "+j);
				
			}
		}

	}

}
