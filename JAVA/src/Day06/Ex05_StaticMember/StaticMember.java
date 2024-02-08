package Day06.Ex05_StaticMember;

public class StaticMember {
	
	// Static 변수
	static int a;
	static int b;
	int c; // 인스턴스 변수는 객체가 생성이 되어야 함 아직 메모리 공간에 할당 안됨.
	static final double PI = 3.141592; // 한번 선언이 되서 값이 초기화 되었기 때문에 다시 변수로 선언하여 값을 바꿀수 없다.(final함수의 특징)
	
	//static 메소드
	public static int sum(int x, int y) {
		int sum = a+b+x+y;
//		 sum += c;
		// c 는  static 변수가 아니고 인스턴스 변수이기 때문에,
		// 객체생성시 메모리에 할당되으로, static 메소드 내에서 접근할 수 없다.
		return sum;
	}
	public static void main(String[] args) {
		
		int sum = sum(10, 20);
		
		a = 100;
		StaticMember s1 = new StaticMember();
		StaticMember s2 = new StaticMember();
		
		int a1 = s1.a;
		int c1 = s1.c = 10; // c를 s1.c에 대입
		int a2 = s2.a;
		int c2 = s2.c = 20;
		
		// PI = 100;
		
		System.out.println("a1 : " + a1);  //?
		System.out.println("c1 : " + c1);  //?
		System.out.println("a2 : " + a2);  //?
		System.out.println("c2 : " + c2);  //?
		
	}

}
