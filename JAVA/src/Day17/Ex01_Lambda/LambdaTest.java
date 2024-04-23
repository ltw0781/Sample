package Day17.Ex01_Lambda;

/** 
 *  익명 객체
 *  - 익명 자식 객체 :부모는 이름이 있지만 자식은 없음
 *  - 익명 구현 객체 : 부모 인터페이스 존재 구현한 클래스 이름 없음
 *  
 *  익명 함수 : 함수 이름이 없음
 *  
 *  * 익명 자식 객체 vs 익명 구현 객체 vs 익명 함수
 */


// 익명 자식 객체의 부모클래스 정의
class Television{
	void VolumnUp() { System.out.println("UP"); }
	void VolumnDown() { System.out.println("DOWN");}
}
interface RemoteControl{
	void VolumnUp();
	void VolumnDown();
}
@FunctionalInterface
interface Calculator{
	int calc(int a, int b);
}


public class LambdaTest {
	
	public static void main(String[] args) {
		
		Television tv = new Television() {

			@Override
			void VolumnUp() {
				System.out.println("UP- 구현");
			}

			@Override
			void VolumnDown() {
				System.out.println("DOWN - 구현");
			}
			
		};
		tv.VolumnUp();
		tv.VolumnDown();
		
		// 익명 구현 객체
		
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void VolumnUp() {
				System.out.println("UP- 구현");
				
			}
			
			@Override
			public void VolumnDown() {
				System.out.println("DOWN - 구현");
				
			}
		};
		tv.VolumnUp();
		tv.VolumnDown();
		
		// 익명 구현 객체2
		Calculator cal = new Calculator() {
			
			@Override
			public int calc(int a, int b) {
				
				return a + b;
			}
		};
		int result1 = cal.calc(10, 20);
		System.out.println("result1 : " + result1);
		
		// 람다식
		Calculator calcLambda = (a, b) -> {return a +b;};
		int result2 = calcLambda.calc(30, 40);
		System.out.println("result2 : " + result2);
		
	}

}













