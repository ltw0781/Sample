import java.util.Iterator;
import java.util.Scanner;

/**
	(순서도)
		
		1. 정수 N, M을 입력받는다.
		2. M, N번 반복하여 N, M개의 정수를 입력 받는다.
		3. 입력받은 정수 M, N을 변수 M,N에 대입한다.
		4. N번, M번 반복 하여 N,M개의 정수를 배열 arr에 저장 한다.
		5. 배열 arr을 반복하여, 최댓값 변수Max 와 i번째 배열 요소를 비교한다.
		6. 두 요소 중 더 큰 요소를 max에 대입 한다.
		7. 반복이 끝나고, 변수 max 를 출력 한다.
				
 */
public class _Ex_Max {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N의 값을 입력해 주세요 : ");
		int N = sc.nextInt();
		System.out.print("M의 값을 입력해 주세요 : ");
		int M = sc.nextInt();
		
		int A[][] = new int[N][M];
		
		int arr[][] = new int[N][M];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
				
			}
		}
		
		for (int i = 0; i < arr.length; i++) {			
			for (int j = 0; j < arr[i].length; j++) {
				A[i][j] = arr[i][j];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
