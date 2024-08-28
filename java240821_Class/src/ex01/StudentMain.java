package ex01;

public class StudentMain {

	public static void main(String[] args) {
		
		
		//객체생성
		Student s1 = new Student("홍길동", "20", "010-1234-1234");
		s1.info();
		Student s2 = new Student("홍길동", "20");
		s2.info();
		
		/////////////////////
		s2.setName("ㄴㅇㄴㅇ");
		System.out.println(s2.getName());

		


		
	}

}
