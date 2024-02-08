package Day04;

// 배열은 변수를 생성한 후에 배열의 값을 추가한다.

public class Ex01_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열 선언
		// - 자료형 변수명[];
		int arr[];
		
		// 배열 생성
		// - 변수명 = new 자료형[개수];
		arr = new int[5];
		
		// 배열 요소에 접근
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		//배열의 길이 : 배열 요소의 개수 = 배열.length
		int N = arr.length;
		System.out.println("배열의 길이 : " + arr.length);
		
		// for : ctrl + space 2번째 옵션
		for (int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
	}

}
