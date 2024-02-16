package Day11.Ex05_ExceptionThrows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionThrows {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			//input() 메소드에서 예외를 전가해서,
			// 호출한 곳에서 예외처리를 해야 한다.
			input();
		} catch(Exception e) {
			e.printStackTrace();
			System.err.println("정수를 입력 하세요");
		}
		
	}
	
	//예외 전가 (예외 던지기; 예외떠넘기기) - throws
	// : 예외 처리에 대한 책임을 메소드 호출한 곳으로 떠넘기는것
	public static void input() throws InputMismatchException {
		
		System.out.print("입력 : ");
		int input = sc.nextInt();		// 예외 발생 가능성 코드
		System.out.println(input);
		
	}
}
