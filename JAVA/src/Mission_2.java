import java.util.Scanner;

/**
 *  정수 N을 입력 받는다.
 *  정수 N의 값이 홀수 이면
 *  1 ~ 10 까지의 정수중에 홀수인 값
 *  1, 3, 5, 7, 9의 값을 출력하여 다 더한다.
 *  정수 N의 값이 짝수 이면
 *  1 ~ 10 까지의 정수중에 짝수인 값
 *  2, 4, 6, 8, 10의 값을 출력하여 다 더한다
 *  마지막으로 N의 약수만 출력한다
 */

public class Mission_2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = 1;
		int count;
		
		for (int i = 1 ; i < N; i+=2) {
			System.out.print(i);
			if (i == (N-1)) {
				System.out.print(" = ");
			}
			else {
				System.out.print(" + ");
			}
		}
		System.out.println();
//		
//		for (int i = 2 ; i <= N ; i+=2) {
//			System.out.print(i);
//			if (i == N) {
//				System.out.print(" = ");
//			}
//			else {
//				System.out.print(" + ");
//			}
//		}
//		System.out.println();
//		for (int i = 2 ; i <= N ; i++) {
//			System.out.print();
//			if (i == N) {
//				System.out.print(" = ");
//			}
//			else {
//				System.out.print(" + ");
//			}
//		}

	}
}
