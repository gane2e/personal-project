//5명의 점수를 반복문으로 입력받아서 반복문으로 출력하고, 입력받은 점수 중 최대값 구하기
package ex01;

import java.util.Scanner;

public class 문제1연습2 {

	public static void main(String[] args) {
	
		int[] com = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		
		//입력
		for (int i=0; i<com.length; i++) {
			System.out.printf("%d번째 학생 점수를 입력하세요.", i+1);
			com[i] = sc.nextInt();
		}
		
	
		//출력
		System.out.println("데이터 출력 : ");
		for(int i=0; i<com.length; i++) {
			System.out.printf(com[i] + ", ");
		}
	
		System.out.println(" ");
		
		//데이터 역순 출력
		System.out.println("데이터 역순 출력 : ");
		for(int i=0; i<com.length; i++) {
			System.out.printf(com[com.length-1-i] + ", ");
		}

		int max, min;
		max = 0;
		min = com[0];
		
		for(int i=0; i<com.length; i++) {
			//최대값 구하기
			if (com[i] > max) {
				max = com[i];
			}
			//최소값 구하기
			if (com[i] < min) {
				min = com[i];
			}	
		}
		System.out.printf("\n최대값 : %d\n최소값 : %d ", max, min);
	

		//총점 구하기
		int sum = 0;
		for(int i=0; i<com.length; i++) {
			sum += com[i];
		}
		System.out.println("\n총점 : " + sum);
		
		//평균 구하기
		double avg = 0;
		avg = (double)sum/com.length;
		System.out.printf("평균 : %.2f", avg);
		
		//정렬 드디어 성공했더ㅣㅣ....
		for(int i=0; i<com.length; i++) {
			for(int j=0; j<com.length-1-i; j++) {
				if (com[j] > com[j+1]) {
					int tmp = com[j];
					com[j] = com[j+1];
					com[j+1] = tmp;
				}
			}
		}
		System.out.println("\n값이 낮은 순으로 출력 : ");
		for(int i=0; i<com.length; i++) {
			System.out.printf("%d, ", com[i]);
		}
		
		
		
	}

}
