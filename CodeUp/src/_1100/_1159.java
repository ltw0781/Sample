package _1100;

import java.util.Scanner;

/**
 *  슬기가 던진 공의 위치를 정수형 변수 N에 입력
 *  1. 슬기가 던진 공의 위치가 50 ~ 70이면 슬기가 이김
 *  2. 공의 위치가 6의 배수라면 슬기가 이김
 *  슬기가 이기는 조건에는 win 을 출력하고 아니면 lose를 출력 하세요.
 */

public class _1159 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if(50 <= N && N <= 70) {
			System.out.println("win");
			
		}
		else if(N % 6 ==0) {
			System.out.println("win");
		}
		else {
			System.out.println("lose");
		}
		
		
		
	}

}
