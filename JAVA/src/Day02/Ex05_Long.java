package Day02;

public class Ex05_Long {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int (4bytes : 32bits) : 2^32 개 : 약 42억개
		// int 수 표현 범위 : -21억xxx ~ 21억xxx
		
		// long (8bytes : 64bits) : 2^64 개
		long In1 = 1000;
		long In2 = 2100000000;
		
		// ** L 을 붙이지 않으면 기본정수는 int 타입으로 취급한다
		
		long In3 = 2200000000L; // ??
		
		System.out.println("In1 : " + In1);
		System.out.println("In2 : " + In2);
		System.out.println("In3 : " + In3);

	}

}
