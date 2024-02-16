package _1400;


/**
 *  1. 배열을 생성하고 배열에 입력된 숫자를 오름차순으로 정렬 하세요.
 *  2. 배열을 생성하시오. --> arr[N] = arr[입력변수에 입력된 값에 해당하는 숫자만큼의 배열 (n = 3] arr[n1] | arr[n2] | arr[n3]...
 *  3. 배열안에 들어갈 숫자를 입력 하시오. arr[n1] = ?...
 *  4. 입력된 배열의 값을 처음의 숫자와 비교하여 
 *  5. 
 */


import java.util.Scanner;

public class _1442_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int min, temp;
		int arr[] = new int[N]; 
		
		// 입력 = N의 숫자 만큼의 배열 생성
		for (int i = 0 ; i < N ; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		for (int i = 0 ; i < N ; i++) {
			//min = i;
			for (int j = i + 1 ; j < N ; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j]; 
					arr[j] = temp;
				}
				
			}
			// ↑↑↑↑↑↑↑ 은 i = 1일때 i가 N보다 작거나 같으면 min = i(초기값은 1)을 대입하고 아래의 함수를 실행 함수를 모두 실행 하고 나면 min = i를 1씩 증가 시킨다.
		}

			for (int j = 0 ; j < N ; j++) {
				
				System.out.print(arr[j] + " ");
				
			}
			System.out.println();
			
		}
		
	}


