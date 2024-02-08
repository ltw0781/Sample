package Day03;

import java.util.Scanner;

public class Ex07_switchBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		
		// 입력 받은 정수를 5로 나눈 나머지가
		// 2보다 작으면 "*" 출력
		// 그렇지 않으면 "**" 출력
		// - switch 문을 사용하여 작성하시오.
		
		switch(input % 5) {
		case 0 : 
			System.out.println("*");
			break;
		case 1 : 
			System.out.println("*");
			break;
		case 2 : 
			System.out.println("**");
			break;
		case 3 : 
			System.out.println("**");
			break;
		case 4 : 
			System.out.println("**");
			break;
		default:
		break;
			
		}
		
		
		//
		
		sc.close();

	}

}
