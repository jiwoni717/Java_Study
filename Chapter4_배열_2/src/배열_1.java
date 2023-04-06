import java.util.Arrays;

/*
 * 		모아서 관리
 * 		- 데이터 ==> 배열(같은 데이터) / 클래스
 * 		- 명령문 ==> 메소드 (재사용)
 * 
 * 		배열
 * 		- 같은 데이터형을 연속적으로 배치
 * 		- 인덱스 번호 이용(0부터 시작)
 * 		- 고정적(추가, 삭제 불가 변경시에는 더 큰 배열을 생성해서 사용)
 * 		- 얕은 복사 : 별칭, 참조 (같은 메모리 주소를 활용 => 변경하면 원본도 변경)
 * 			int[] arr={};
 * 			int[] arr2=arr;
 * 		  깊은 복사 : 데이터만 복사, 새로운 메모리를 만들어서 저장
 * 			int[] arr={};
 * 			int[] arr2=arr.clone()
 * 			System.arraycopy()
 * 		- 배열의 크기 : length
 * 		- 출력시에 주로 사용 => for-each(향상된 for)
 * 		  ------------- 브라우저에서 변경하는 것이 아니라 있는 그대로 출력
 * 		  배열 / 컬렉션 (데이터가 모아져있어야 사용 가능)
 * 		  => 인덱스를 이용하는 프로그램이 아니다
 * 		  => 배열에 저장된 값을 한개씩 읽어온다.
 * 			  int[] arr = {10,20,30,40,50}
 * 			  for(int a:arr) //같거나 큰 데이터형 사용
 * 			  {
 * 				a=10, a=20, a=30, a=40, a=50 ==> 자동으로 종료
 * 			  }
 * 
 * 			  char[] arr={'A','B','C'}
 * 			  for(char c:arr)
 * 			  {
 * 				char c는 실제 저장된 데이터를 가져온다
 * 			  }
 * 
 * 			  int[] arr={10,20,30,40,50};
 * 			  for(int i:arr)
 * 			  {
 * 				i=100; // 값 변경 불가능
 * 			  }
 * 		- 초기값, 값을 변경시에는 일반 for문 이용 (인덱스)
 * 		
 */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50};
		for(int i:arr)
		{
			i=100;
			System.out.println(i);
		}
		System.out.println(Arrays.toString(arr));

	}

}
