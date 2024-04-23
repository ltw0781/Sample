<<<<<<< HEAD
package Day05.Class;

//상속
// - 키워드 : 자식클래스 extends 부모클래스
public class Raichu extends Pikachu{
		public Raichu() {
//		super(); // <-- 부모와 자식의 결과 값이 다를때
			energy = 300;
			type = "슈퍼전기";
	}

	public Raichu(int energy, String type) {
//		super(energy, type);
	}
	//메소드 오버라이딩
	// : 부모 클래스의 메-소드를 자식클래스에서 재정의하여
	// 부모 메소드를 무시하고, 자식 메소드를 우선하여 실행하는 것

	
	// @Override 어노테이션 : 기능활성화의 역할을 할 수 있음. / 알려주는 역할도 함
	@Override
	public String aAttack() {
		System.out.println("공격 A : " + super.aAttack());
		return "백만볼트";
	}

	@Override
	public String bAttack() {
		return "볼트체인지";
	}
	public String cAttack() {
		return "아이언테일";
	}
	


	}


=======
package Day05.Class;

//상속
// - 키워드 : 자식클래스 extends 부모클래스
public class Raichu extends Pikachu{
		public Raichu() {
//		super(); // <-- 부모와 자식의 결과 값이 다를때
			energy = 300;
			type = "슈퍼전기";
	}

	public Raichu(int energy, String type) {
//		super(energy, type);
	}
	//메소드 오버라이딩
	// : 부모 클래스의 메-소드를 자식클래스에서 재정의하여
	// 부모 메소드를 무시하고, 자식 메소드를 우선하여 실행하는 것

	
	// @Override 어노테이션 : 기능활성화의 역할을 할 수 있음. / 알려주는 역할도 함
	@Override
	public String aAttack() {
		System.out.println("공격 A0 : " + super.aAttack());
		return "백만볼트";
	}

	@Override
	public String bAttack() {
		return "볼트체인지";
	}
	public String cAttack() {
		return "아이언테일";
	}
	


	}


>>>>>>> branch 'main' of https://github.com/ltw0781/Sample.git
