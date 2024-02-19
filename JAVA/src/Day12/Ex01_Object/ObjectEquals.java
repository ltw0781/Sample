package Day12.Ex01_Object;



/**
 * Object 클래스의 equals() 메소드 활용
 */

class Student {
	
	int studentId;
	String studentName;

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Studnet [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

	// equals() 메소드 오버라이딩
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		
		
		// null 체크 - 비교대상이 null인 경우 비교 자체가 불가
		// * NullPointerException 발생 가능
		if (obj == null) {
			return false;
		}
		
		// 학번과 학생명이 모두 일치하는 경우
		Student student = (Student) obj;
		
		if(this.studentId == student.studentId && this.studentName.equals(student.studentName)) {
			return true;
			
		}
		
		return false;
	}


	

	
}

public class ObjectEquals {
	
	public static void main(String[] args) {
		
		Student student = new Student(1001, "김조은");
		Student student2 = student;
		Student student3 = new Student(1001, "김조은");
		
		
		// 학생1과 학생2의 래퍼런스 비교
		if(student == student2) {
			
			
			System.out.println("student 와 student2의 주소 (레퍼런스)가 같습니다.");
			
		}
		else {
			System.out.println("stdent와 student2의 주소(레퍼런스)가 다릅니다.");
		}
		System.out.println("=====================");
		
		//학생 1과 학생2의 인스턴스 비교
		if(student.equals(student2)) {
			
			
			System.out.println("student 와 student는 같습니다.");
			
		}
		else {
			System.out.println("student 와 student는 다릅니다.");
		}
		System.out.println("=====================");
		
		
		// ==================================================
		
		// 학생1과 학생3의 래퍼런스 비교
		if(student == student3) {
			
			
			System.out.println("student 와 student3의 주소 (레퍼런스)가 같습니다.");
			
		}
		else {
			System.out.println("stdent와 student3의 주소(레퍼런스)가 다릅니다.");
		}
		System.out.println("=====================");
		
		//학생 1과 학생3의 인스턴스 비교
		if(student.equals(student3)) {
			
			
			System.out.println("student 와 student3은 같습니다.");
			
		}
		else {
			System.out.println("student 와 student3은 다릅니다.");
		}
		
		
		
	}

}

