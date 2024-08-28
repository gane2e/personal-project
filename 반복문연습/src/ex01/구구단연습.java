//5명의 점수를 반복문으로 입력받아서 반복문으로 출력하고, 입력받은 점수 중 최대값 구하기
package ex01;

import java.util.Scanner;

public class 구구단연습 {

	public static void main(String[] args) {
	
		
	//2단 뽑기
		for(int i=1; i<=9; i++) {
			System.out.printf("2 X %d = %d\n", i, 2*i);
			
		}
		
	//n~n단 뽑기 (2중포문)
		for(int i=2; i<=9; i++) {//n~단
			for(int j=1; j<=9; j++)//~n단
				System.out.printf("%d X %d = %d\n", i, j, i*j);
			System.out.println("--------------");
		}

		
		
		
	}

}
