//5명의 점수를 반복문으로 입력받아서 반복문으로 출력하고, 입력받은 점수 중 최대값 구하기
package ex01;

import java.util.Scanner;

public class 구구단 {

	public static void main(String[] args) {
	
//		for(int i=1; i<=9; i++) {
//		System.out.printf("2 X %d = %d\n", i, 2*i);
//	}
		
		for(int i=2; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				System.out.printf("%d X %d = %d\n", i, j, i*j);
			}
		}
		System.out.println("------------------------");

		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

		
		
		
	}

}
