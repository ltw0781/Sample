package Day12.Ex02_Wrapper;

public class IntegerEx {
	
	public static void main(String[] args) {
		
		// int -> Integer
		// : 정수의 타입인 int 기본 타입을 객체화한 클래스
		int a = 10;
		Integer A = 100;
		
		// 주요 메소드
		// (문자열) --> (정수)
		// (정수) --> (문자열)
		// (정수) --> (다른타입)
		
		System.out.println(Integer.parseInt("28") + 2);			// 문자열 --> 정수
		System.out.println(Integer.toString(28) + 2);			// 정수 --> 문자열
		System.out.println(28 + "");							// 정수 --> 문자열 (Integer 메소드 없이
		System.out.println(A.doubleValue() + 2.5);				// 정수 --> 실수
		System.out.println(Integer.toBinaryString(28));			// 이진수 문자열로 변환
		System.out.println(Integer.bitCount(28));				// 이진수 1비트 개수
		
		// @Deprecated --> 컴파일 할 때에는 문제가 없지만 더이상 상용하지 않기를 권장하는 문법
		
		// * 오토 박싱(Auto Boxing)
		// 자바 5버전 부터는 객체로 생성하여 사용하지 않아도 자동으로  객체로 감싸준다.
		// Integer i = new Integer(10);		--> 이렇게 명시를 해야 박싱이었다.
		// 박싱 과 언 박싱
		Integer i = 10;
		int value = i.intValue();
		 System.out.println("객체로 생성한 Integer : " + i);
		 System.out.println("기본타입 int : " + value);
		
		
	}

}
