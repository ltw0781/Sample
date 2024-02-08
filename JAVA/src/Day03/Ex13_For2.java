package Day03;

import java.util.Scanner;

public class Ex13_For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 구구단 만들기
		//입력 : 5
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		int input = sc.nextInt();
		
		//9회 반복
		//입력 단 * 반복변수 = 결과
		
		for (int i = 1 ; i <= 9 ; i++) {
			int result = input * i;
			System.out.println(input + "*" + i + "=" + result);
		}
		sc.close();

	}

}
