package Day17.Ex02_Stream;

import java.util.Scanner;

/**
 *  
 */

public class LottoArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 게임 : ");
		int N= sc.nextInt();
		
		// N번 반복
		for (int i = 0; i < N; i++) {
			System.out.print("[" + (i+1) + " 게임] : ");
			int lotto[] = new int[6];
			
			// 랜덤 수 6을 대입
			for (int j = 0; j < lotto.length; j++) {
				int rand = (int) (Math.random() * 45 +1);
				lotto[j] = rand;
				
				//중복 제거
				for (int k = 0; k < j; k++) {
					// 현재 뽑은 랜덤 수가, 기존의 수들과 똑같으면, 다시 뽑는다.
					if(rand == lotto[k]) {
						
						
						j--;
						break;
						
					}
				}
			}// -- 랜덤수 6개 대입 끝
			
			// 해당 i 번째 게임의 랜덤 수들을 정렬 - 오름차순
			for (int j = 0; j < lotto.length; j++) {
				for (int k = j+1 ; k < lotto.length; k++) {
					if(lotto[j] > lotto[k]) {
						// 앞의 요소가 더 크면 교환 - swap
						int temp = lotto[j];
						lotto[j] = lotto[k];
						lotto[k] = temp;
						
					}
				}
			} // 정렬 끝
			
			for (int j = 0; j < lotto.length; j++) {
				
				System.out.print(lotto[j] + " ");
				
			}
			System.out.println();
		}
		
		sc.close();
	}

}


















