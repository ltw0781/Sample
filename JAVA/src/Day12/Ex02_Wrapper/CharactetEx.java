package Day12.Ex02_Wrapper;

public class CharactetEx {

	public static void main(String[] args) {
		
		// Charater
		// char -> Character
		// : 문자 타입입 char 기본 타입을 객체화한 클래스
		// * 주요 메소드
		// - 대소문자 변환
		// - 문자/숫자인지 여부 확인
		
		
		char a = 'a';
		char b = 'A';
		
		System.out.println(Character.toUpperCase(a));
		System.out.println(Character.toLowerCase(b));
		
		char c1 = '5';
		char c2 = 'X';
		
		if (Character.isDigit(c1)) {
			System.out.println(c1 + "(은/는) 숫자입니다");
		}
		if (Character.isAlphabetic(c2)) {
			System.out.println(c2 + "(은/는) 영문자 입니다.");
		}
		
		
	String str = "Hello The Jouen Academy";
	
	char[]  arr = str.toCharArray();
	int count = 0;
	for (int  i = 0 ; i < arr.length ; i++) {
		//대문자인지 확인
		if (Character.isUpperCase(arr[i])) {
			count++;
		}
		
	}
		System.out.println(str + " - 대문자 개수 : " + count);
	}
	
}
