/*
 * 수동 형변환 or 강제 형변환
 * 큰 자료형 -> 작은 자료형 대입한다.
 */
package ex03;

public class 캐스트형변환 {

	public static void main(String[] args) {
		
		short s1;
		int num1 = 50000;
		s1 = (short)num1; //변수명 = (변수)값명; 
		
		System.out.println(s1);

		
		double d1 = 10.2;
		int num2 = (int)d1; // 정수(int)변수에 실수 값을 넣으면 정수로 출력된다.
		System.out.println(num2);

		
		
		
		System.out.println("------------");
		/*
		 * 정수 연산 정수 => 정수
		 * 정수 연산 실수 => 실수
		 * 정수or실수 연산 문자 => 문자
		 */

		
		double d2 = 10+10.2;
		String str1 = 10 + "10";
		System.out.println(d2);
		System.out.println(str1);
		
		
		
		short s2;
		int num3 = 50000;
		s2 = (short)num1;
		
		System.out.println(s2);
		
	}

}
