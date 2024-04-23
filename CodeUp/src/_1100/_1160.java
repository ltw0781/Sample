package _1100;

import java.util.Scanner;

/**
 *  1 ~ 7 까지의 정수를 입력 받는다.
 *  1, 3, 5, 7의 수가 입력되면 oh my god이 출력된다
 *  나머지 숫자가 입력되면 enjoy를 출력한다.
 */

public class _1160 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if (N >= 7 || N % 2 == 1) {
			
			System.out.println("oh my god");
			
		}
		else {
			System.out.println("enjoy");
		}
		
	}

}
