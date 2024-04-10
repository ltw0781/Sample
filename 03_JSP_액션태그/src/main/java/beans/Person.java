package beans;

import java.io.Serializable;

public class Person implements Serializable{

	private static final long serialVersionUID = 1L;
	
//	기본생성자가 없어서 오류 났었음
	private String name;
	private int age;
	public Person() {
		this.name = "김조은";
		this.age = 20;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
