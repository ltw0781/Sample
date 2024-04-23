package Day03;

import java.util.Scanner;

public class Ex01_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 제어문 조건에 맞는 연산을 하면 뒤에 연산을 하지 않는다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int a = num % 2;
		
		// 입력받은 값이 홀수인지, 짝수인지 판단하시오.
		// 홀수, 짝수 조건?
		if (a == 1) {
			System.out.println("홀수입니다.");
		}
		else {
			System.out.println("짝수입니다.");
		}
		sc.close();
	}

}
