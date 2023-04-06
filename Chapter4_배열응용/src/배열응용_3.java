import java.util.Arrays;

// 6개의 난수 발생 => 1~45 => 중복된 수가 나오면 안됨
public class 배열응용_3 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i] = (int)(Math.random()*45)+1;
			for(int j=0;j<i;j++)
			{
				if(lotto[i]==lotto[j])
				{
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));

/*		int su = 0; // 난수 저장
		boolean bCheck = false; // 중복여부 확인
		for(int i=0;i<lotto.length;i++)
		{
			bCheck = true;
			while(bCheck)
			{
				su=(int)(Math.random()*45)+1;
				bCheck = false; //false면 난수를 저장하고 빠져나감
				for(int j=0;j<i;j++)
				{
					if(lotto[j]==su)
					{
						bCheck = true; //중복이 있으면(==true가 되면) 다시 난수 발생
						break;
					}
				}
			}
			lotto[i] = su;
		}
*/
	}

}
