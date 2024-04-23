package Day17.Ex01_Lambda;

// 람다식 사용하기
// 1. 함수형 인터페이스 정의
// * 추상 메소드가 1개인 인터페이스를 정의
// 2. 람다식 익명함수 정의하여, 인터페이스에 선언
// 3. 람다식 함수 호출

@FunctionalInterface
interface FuncInterface1 {
	// @FunctionalInterfae 를 지정하면, 추상메소드를 2개 이상 정의하면 에러가 발생 한다.
	void method();
//	void method2();			* 함수형 인터페이스는, 추상 메소드 1개만 정의해야 한다.

} // 1

@FunctionalInterface
interface FuncInterface2 {void method(String a, String b);} // 1

@FunctionalInterface
interface FuncInterface3 {String method();} // 1

@FunctionalInterface
interface FuncInterface4 {String method(String a, String b);} // 1. 반환타입이 있는 람다식

public class LambdaFormat {
	
	public static void main(String[] args) {
		
		// 매개변수, 반환타입 없는 람다식
		// () -> { System.out.println("람다식"); }
		// () -> System.out.println("람다식");		* 한 문장이면 {}중괄호 생략 가능
		// 그때 그때 함수를 정의하여 호출하는 방식 : 함수형 프로그래밍
		FuncInterface1 fi1 = () -> System.out.println("자바람다식1"); //2

		fi1.method(); // 3
		
		// 매개변수 있는 람다식
		// (a, b) -> {System.out.println(a + b);}
		FuncInterface2 fi2 = (a, b) -> {
			
			String result = a + b;
			System.out.println(result);
			
		};
		fi2.method("자바", "람다식2");
		
		
		
		// 반환타입 있는 람다식
		// () -> {return 1 + 2 ;}
		FuncInterface3 fi3 = () -> {
			
			String a = "자바";
			String b = "람다식3";
			return a + b;
			
		};
		String result3 = fi3.method();
		System.out.println(result3);
		
		// 매개변수, 반환타입 있는 람다식
		// (a, b) -> { return a + b; }
		// (a, b) -> return a + b;			// * 에러 : return 이 있을 땐, {} 생략 불가
		// (a, b) -> a + b;					// * return 문만 있다면 , "return, {}" 동시 생략 가능
		
		FuncInterface4 fi4 = (a, b) -> { return a + b; };
//		(에러) FuncInterface4 fi4 = (a, b) -> return a + b;;
		FuncInterface4 fi5 = (a, b) -> a + b;
		
		String result4 = fi4.method("자바", "람다식4");
		String result5 = fi5.method("자바", "람다식5");
		
		System.out.println(result4);
		System.out.println(result5);
		
		
		
	}

}
