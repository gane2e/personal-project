package ex01;

import java.util.Scanner;

public class InputNameAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 기본자료형
		 * 정수형
		 * > byte. short, int, long
		 * 실수형
		 * > float, double
		 * 논리형
		 * > boolean
		 * 문자형
		 * > char
		 */

		Scanner sc = new Scanner(System.in); // 키보드로 값을 입력받겠다
		
		System.out.println("당신의 이름은?");
		String name = sc.nextLine(); //문자열을 입력받겠다. 받을 데이터는 name이라고 칭한다
		System.out.println("나의 이름은 " + name + " 입니다"); //문자열 입력 시 이렇게 출력하겠다
	
		
		System.out.println("당신의 나이는?");
		int age = sc.nextInt(); //정수를 입력받겠다. 받을 데이터는 age라고 칭한다
		System.out.println("나이는 " + age + "살 입니다.");
		
		System.out.println("뭘 잘하시나요?");
		String how = sc.nextLine();
		System.out.println("내가 잘하는 것은 " + how + " 입니다.");
	
		
	}

}
