package ex01;

public class Student {


	private String name; //private 
	private String age;
	private String phone;
	
	//생성자 블록(디폴트)
	Student(){
	}
	
	//생성자 블록
	Student(String name, String age, String phone){
		this.name = name;
		this.age = age ;
		this.phone = phone;
	}//생성자 블록
	Student(String name, String age){
		this(name, age, "-");
	}
	
	//getter
	String getName() {
		return name;
	}
	//setter
	void setName(String name) {
		this.name = name;
	}

	
	//method
	void info() {
		System.out.printf("이름 : %s, 나이 : %s 번호 : %s\n", name, age, phone);
	}

}
