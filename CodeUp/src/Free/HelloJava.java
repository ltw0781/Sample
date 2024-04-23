package Free;

public class HelloJava {
	public static void main(String[] args) {
		System.out.println("Hello Java");	
		System.out.println();	
		
		char a = '글';
		
		int unicode = a;
		
		System.out.print("글의 유니코드 값 : " + unicode);
		System.out.println();
		
		int c = 10;
		double d = 2.0;
		
		int sum = (int) (c + d);
		
		System.out.println("a + b의 값은 : " + sum);
		System.out.println();
		
		for(int i = 0 ; i < c ; i++) {
			System.out.print("증가 값 : " + i);
			System.out.println();
		}

	}
	
}
