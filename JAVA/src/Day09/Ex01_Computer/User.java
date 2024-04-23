package Day09.Ex01_Computer;

public class User {
	
	public static void main(String[] args) {
		
		Computer computer = new Desktop();
		
		// Laptop은 추상클래스로 정의되어 있어서 생성할 수 없다.
		
		
		Computer computer2 = new MacBook();
		
		Laptop laptop = new MacBook();
		MacBook macBook = new MacBook();
		
		computer.on();
		computer.display();
		computer.typing();
		computer.off();
		System.out.println();
		
		computer2.on();
		computer2.display();
		computer2.typing();
		computer2.off();
		System.out.println();
		
		laptop.on();
		laptop.display();
		laptop.typing();
		laptop.off();
		System.out.println();
		
		macBook.on();
		macBook.display();
		macBook.typing();
		macBook.off();
		System.out.println();
		
	}

}
