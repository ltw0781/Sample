package Day09.Ex01_Computer;


// 부모클래스의 추상메소드는 반드시 오버라이딩 해야한다.
public class Desktop  extends Computer{

	@Override
	public void display() {
		
		System.out.println("Desktop - display");
		
	}

	@Override
	public void typing() {
		
		System.out.println("Desktop - typing");
		
	}

}
