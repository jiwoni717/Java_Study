/*
 * 		매개변수 전송법
 * 			1) Call By Value : 일반 기본형 데이터 전송 (String)
 * 			2) Call By Reference : 주소값을 전송 (배열, 클래스)
 */
public class 메소드_2 {
	static void swap2(int[] arr2)
	{
		System.out.println("arr2 = "+arr2);
		System.out.println("교환전 : arr2[0] = "+arr2[0]+", arr2[1] = "+arr2[1]);
		int temp = arr2[0];
		arr2[0] = arr2[1];
		arr2[1] = temp;
		
		System.out.println("교환후 : arr2[0] = "+arr2[0]+", arr2[1] = "+arr2[1]);
	}
/*	static void swap(int x, int y)
	{
		System.out.println("교환전 : x = "+x+", y = "+y);
		int temp = x;
		x=y;
		y=temp;
		
		System.out.println("교환후 : x = "+x+", y = "+y);
	}
	*/
	static void swap3(String id, String pwd)
	{
		System.out.println("교환전 id = "+id+", pwd = "+pwd);
		String temp = id;
		id = pwd;
		pwd = temp;
		
		System.out.println("교환후 id = "+id+", pwd = "+pwd);
	}
	public static void main(String[] args) {
/*		int x = 10;
		int y = 20;
		swap(x,y);
		System.out.println("종료후 : x = "+x+", y = "+y);
		// 값만 전송
*/
		
		int[] arr = {10, 20};
		System.out.println("arr = "+arr);
		swap2(arr); // int[] arr2 = arr
		System.out.println("종료후 : arr[0] = "+arr[0]+", arr[1] = "+arr[1]);
		// 배열, 클래스 => 메소드 자체에서 변경이 가능하다
		
		String id = "admin";
		String pwd = "1234";
		swap3(id, pwd);
		System.out.println("종료후 id = "+id+", pwd = "+pwd);
	}

}
