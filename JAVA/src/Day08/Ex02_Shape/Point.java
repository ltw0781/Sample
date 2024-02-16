package Day08.Ex02_Shape;

// 추상클래스의 추상 메소드는 반드시 클래스에서 오버라이딩을 해야 한다.

public class Point {
	
	//맴버변수 x, y
	int x, y;

	
	// alt + shift + s 
	// 기본생성자
	public Point() {
		
	}

	// 매개변수가 있는 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// toString
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
