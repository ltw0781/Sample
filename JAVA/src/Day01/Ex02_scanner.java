package Day01;

import java.util.Scanner;

// 외부에서 정의된 클래스를 포합시키기
// import 패키지명, 클래스명;

// [import 하는 법]
// 1. class : ctrl + space
// 2. 전체 impot : ctrl + shift + o

public class Ex02_scanner {

	//main - ctrl + space
	public static void main(String[] args) {
		// 객체생성 키워드 : new
		// 클래스타입 객체명 = new 클래스명();
		// Scanner : 표준 입력 객체
		Scanner sc = new Scanner(System.in);
		
		// (에러)         - 빨간 밑줄로 표시
		//               : 에러가 발생하면 프로그램 실행 불가능
		
		// (경고)         - 노란 밑줄로 표시
		//               : 경고가 발생해도 프로그램은 실행 가능
		
		System.out.print("a : ");
		int a = sc.nextInt();
		
		System.out.println("a : " + a);
		
		// "문자열"
		// : 큰 따옴표로 묶여있는 데이터
		// "문자열" + 변수(숫자)
		// - 문자열과 숫자를 +(연결 연산자)로 연결할 수 있다.
		// 이때, 숫자 데이터는 문자열로 변환되어 연결된다.
		
		// close() : Scanner 객체를 메모리에서 해제하는 메소드
		sc.close();
		
		// sc.nextInt();
		// Scanner 객체를 해제한 후에는 더이상 입력 받을수 없다.

	}

}
