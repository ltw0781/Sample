<<<<<<< HEAD
package Day05.Class;

public class Jiwoo {
	// void --> int, double, String ... <-- 해당 함수를 썼을 때에는 반드시 쓴다.
	// void : 반환값이 없을 때는 void를 쓰지 않음
	public static void main(String[] args) {
		
		//객체생성
		// - 클래스타입 객체명 = new 클래스명();
		Pikachu pikachu = new Pikachu();
		// (.)접근 연산자 : 객체의 변수, 메소드에 접근하는 연산자
//		 pikachu.energy = 100;
//		 pikachu.type = "전기";
		
//		Pikachu pikachu20 = new Pikachu(150, "진화");
		
		System.out.println("############### 피카츄 ###############");
		System.out.println("에너지 : " + pikachu.energy);
		System.out.println("타입 : " + pikachu.type);
		System.out.println("공격 A : " + pikachu.aAttack());
		System.out.println("공격 B : " + pikachu.bAttack());
		System.out.println();
		
		
		Pikachu pikachu20 = new Pikachu(150, "진화");
		System.out.println("############### 피카츄(Lv.20) ###############");
		System.out.println("에너지 : " + pikachu20.energy);
		System.out.println("타입 : " + pikachu20.type);
		System.out.println("공격 A : " + pikachu20.aAttack());
		System.out.println("공격 B : " + pikachu20.bAttack());
		System.out.println();
		
		Raichu raichu = new Raichu();
		System.out.println("############### 라이츄 ###############");
		System.out.println("에너지 : " + raichu.energy);
		System.out.println("타입 : " + raichu.type);
		System.out.println("공격 A : " + raichu.aAttack());
		System.out.println("공격 B : " + raichu.bAttack());
		System.out.println("공격 C : " + raichu.cAttack());
		System.out.println();
		
		Raichu raichu40 = new Raichu(300, "슈퍼전기");
		System.out.println("############### 라이츄(Lv.40) ###############");
		System.out.println("에너지 : " + raichu40.energy);
		System.out.println("타입 : " + raichu40.type);
		System.out.println("공격 A : " + raichu40.aAttack());
		System.out.println("공격 B : " + raichu40.bAttack());
		System.out.println("공격 C : " + raichu40.cAttack());
		System.out.println();
		
		
		
	}

}
=======
package Day05.Class;

public class Jiwoo {
	// void --> int, double, String ... <-- 해당 함수를 썼을 때에는 반드시 쓴다.
	// void : 반환값이 없을 때는 void를 쓰지 않음
	public static void main(String[] args) {
		
		//객체생성
		// - 클래스타입 객체명 = new 클래스명();
		Pikachu pikachu = new Pikachu();
		// (.)접근 연산자 : 객체의 변수, 메소드에 접근하는 연산자
//		 pikachu.energy = 100;
//		 pikachu.type = "전기";
		
//		Pikachu pikachu20 = new Pikachu(150, "진화");
		
		System.out.println("############### 피카츄 ###############");
		System.out.println("에너지 : " + pikachu.energy);
		System.out.println("타입 : " + pikachu.type);
		System.out.println("공격 A : " + pikachu.aAttack());
		System.out.println("공격 B : " + pikachu.bAttack());
		System.out.println();
		
		
		Pikachu pikachu20 = new Pikachu(150, "진화");
		System.out.println("############### 피카츄(Lv.20) ###############");
		System.out.println("에너지 : " + pikachu20.energy);
		System.out.println("타입 : " + pikachu20.type);
		System.out.println("공격 A : " + pikachu20.aAttack());
		System.out.println("공격 B : " + pikachu20.bAttack());
		System.out.println();
		
		Raichu raichu = new Raichu();
		System.out.println("############### 라이츄 ###############");
		System.out.println("에너지 : " + raichu.energy);
		System.out.println("타입 : " + raichu.type);
		System.out.println("공격 A : " + raichu.aAttack());
		System.out.println("공격 B : " + raichu.bAttack());
		System.out.println();
		
		Raichu raichu40 = new Raichu(300, "슈퍼전기");
		System.out.println("############### 라이츄(Lv.40) ###############");
		System.out.println("에너지 : " + raichu40.energy);
		System.out.println("타입 : " + raichu40.type);
		System.out.println("공격 A : " + raichu40.aAttack());
		System.out.println("공격 B : " + raichu40.bAttack());
		System.out.println("공격 C : " + raichu40.cAttack());
		System.out.println();
		
		
		
	}

}
>>>>>>> branch 'main' of https://github.com/ltw0781/Sample.git
