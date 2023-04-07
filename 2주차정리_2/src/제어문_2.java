/*
 * 		연산자 / 제어문
 * 		1) 형식
 * 			for(초기값;조건식;증감식)
 * 			{
 * 				반복수행 문장
 * 			}
 * 			초기값 => 조건식 ┌ true => 수행문장 => 증감식 => 조건식...
 * 						 └ false => 종료
 * 
 * 			초기값
 * 			while(조건문)
 * 			{
 * 				수행문장
 * 				증감식
 * 			}
 * 
 * 		필요에 의해 반복문 제어
 * 		break => 반복 중단(조건이 있어야함)
 * 		continue => 반복문에서만 사용 가능
 * 					종료하는 것이 아니라 이동
 * 					for문에서는 증감식으로 이동 / while문에서는 조건식으로 이동
 * 					특정부분을 제외하는 경우에 주로 사용한다.
 * 		주의점)
 * 			break, continue 밑에는 소스 코딩을 할 수 없다.
 * 			자신이 소속된 반복문만 제어한다.
 * 			
 * 			
 */	
public class 제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int i=1;
		while(i<=10)
		{
			if(i%2==0)
			{
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
*/
		int[] arr = {1,2,3,4,5};
		System.out.println(arr); // [I@6504e3b2
		int[] arr2 = arr;
		System.out.println(arr2); // [I@6504e3b2
		arr2[0] = 10;
		System.out.println(arr[0]);
		int[] arr3 = arr.clone(); // arr 크기의 새로운 배열 생성
		System.out.println(arr3); // [I@515f550a
		// 주소에 의한 참조 ==> 메모리 주소를 이용해서 실제 데이터 관리
		// ↑ 클래스도 동일
	}

}
