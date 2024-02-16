package Day04;

import java.util.Scanner;

public class Ex02_Max {
	public static void main(String[] args) {
		
		// 첫째 줄에 입력할 개수 N 입력받고,
		// 둘째 줄에 N 개의 정수를 공백을 두고 입력받시오.
		// N 개의 정수 중, 최댓값을 출력하시오.
		// (입력예시)
		// 5
		// 90 60 70 100 55
		// (출력예시)
		// 최대값 : 100
		
		/*
		 *  (순서도)
		 * 1. 정수 하나를 입력받는다.
		 * 2. 입력받은 정수를 변수N에 대입한다.
		 * 3. N번 반복하여 N개의 정수를 입력받는다.
		 * 4. 입력받은 N개의 정수를 배열 arr에 저장한다.
		 * 5. 배열 arr을 반복하여, 최댓값을 변수 max와 i 번째 배열요소를 비교한다.
		 * 6. 두 요소 중 더 큰 요소를 max 에 대입한다.
		 * 7. 반복이 끝나고, 변수 max 를 출력한다.
		 * */
		// 1. 정수 하나를 입력받는다.
		//2. 입력받은 정수를 변수N에 대입한다.
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //입력받을 데이터 개수
		int arr[] = new int[N]; // 입력
		// 최댓값 선언
		int max = Integer.MIN_VALUE; //int 타입의 최솟값 : -21억
		// 만약 구하는 값이 최솟값일 경우는 MIN_VALUE가 아닌 Max_VALUE를 넣어줘서 가장 큰 값을 아래 값과 비교하게 한다.
		
		// 3. N번 반복하여 N개의 정수를 입력받는다.
		// 4. 입력받은 N개의 정수를 배열 arr에 저장한다.
		// 반복변수 i : 0, 1, 2, 3, 4
		for(int i = 0 ; i < N ; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0 ; i < arr.length; i++) {
			//5. 배열 arr을 반복하여, 최댓값을 변수 max와 i 번째 배열요소를 비교한다.
			if (max < arr[i]) {
				//6. 두 요소 중 더 큰 요소를 max 에 대입한다.
				max = arr[i];
			}
		}
		//7. 반복이 끝나고, 변수 max 를 출력한다.
		System.out.println("최댓값 : " + max);
		sc.close();
		
	}

}