//5명의 점수를 반복문으로 입력받아서 반복문으로 출력하고, 입력받은 점수 중 최대값 구하기
package ex01;

import java.util.Scanner;

public class 문제1연습 {

	public static void main(String[] args) {
	
		int[] com = new int[5];
		
		Scanner sc = new Scanner(System.in); 
		
		//입력
		for (int i=0; i<5; i++) {
			System.out.printf("%d번째 학생의 점수를 입력하세요.", i+1);
			com[i] = sc.nextInt();
		}
	
		//출력
		for (int i=0; i<5; i++) {
			System.out.printf("%d, ", com[i]);
		}
		
		
		//데이터 역순 출력
		for (int i=0; i<5; i++) {
			System.out.printf("%d, ", com[5-1-i]);
		}

		//최대값 구하기
		int max = 0;
		
		for (int i=0; i<5; i++) {
			if (com[i]>max) {
				max = com[i]; 
			}
		}
		System.out.println("\n최대값 : " + max);
		
		
		//최소값 구하기
		int min = 999;
		
		for (int i=0; i<5; i++) {
			if (com[i]<min) {
				min = com[i]; 
			}
		}
		System.out.println("최소값 : " + min);
		

		//총점 구하기
		int sum = 0;
		
		for (int i=0; i<5; i++) {
			sum += com[i];
		}
		System.out.println("총점 : " + sum);
		
		//평균 구하기
		double avg = 0;
		avg = sum / 5.0;
		System.out.printf("평균 : %.1f", avg);
		
		
		//정렬
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<5-1-i; j++) { //4회전을 한다는 의미
				if(com[j] > com[j+1]) {
					int tmp = com[j];
					com[j] = com[j+1];
					com[j+1] = tmp;
				}
			}
		}
		System.out.println("\n정렬하여 출력 : ");
		for(int i=0; i<5; i++) {
			System.out.print(com[i] + ",");
		}
		
		
	}

}
