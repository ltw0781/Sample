package Day08.Ex01_Singleton;

// 디자인 패턴?? : 모범답안 
// - 프로그램 소프트웨어를 효울적으로 작성하기 위한 모범답안

/**
 *  싱글톤 패턴
 *   - 디자인 패턴중 하나로,
 *     프로그렘이 시작 될 때, 최초로 한 번만 메모리를 할당해서 인스턴스를 사용하는 패턴
 *   - 객체가 필요할 때, 새로운 객체를 생성하지 않고 , 기존의 인스턴스를 활용하는 코드 패턴
 *   - 객체를 하나만 생성하기 때문에, 메모리를 효율적으로 사용할수 있다.
 */

public class SingleTon {
	
	//Static 으로 유일한 객체 생성
	private static SingleTon instance = new SingleTon();
	
	// 생성자를  priavte로 정의해서, 외부에서 인스턴스를 막음
	private SingleTon() {
		
		
	}
	
	//유일한 객체를 가져오는 메소드 정의
	public static SingleTon getInstance() {
		if(instance == null) {
			
			instance = new SingleTon();
			
		}
		return instance;
	}
	
}
