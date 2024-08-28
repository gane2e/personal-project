package ex02;

import java.util.Scanner;

public class GradeMain {

	public static void main(String[] args) {

		
		System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력 > ");
		Scanner sc = new Scanner(System.in);

		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		
		Grade me = new Grade(math,science,english);
		System.out.println(me.avg());
		
		sc.close();
	}

}
