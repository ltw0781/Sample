package Day10.Ex02_NestedInterface;

/**
 *  아우터 클래스
 * 
 */
public class I {
	
	// 인터페이스 선언
	J j;
	
	public void setInterface(J j) {
		
		this.j = j;
		
	}
	
	static interface J{
		
		// 중첩 인터페이스 정의
		
		void methodA();
		void methodB();
		
	}
	void method() {
		
		j.methodA();
		j.methodB();
		
	}

}
