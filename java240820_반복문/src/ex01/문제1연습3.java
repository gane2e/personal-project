//5명의 점수를 반복문으로 입력받아서 반복문으로 출력하고, 입력받은 점수 중 최대값 구하기
package ex01;

import java.util.Scanner;

public class 문제1연습3 {

	public static void main(String[] args) {
	

		int[] com = new int[5];
		Scanner sc = new Scanner(System.in);
	
		
		//입력
		for(int i=0; i<com.length; i++) {
			System.out.printf("%d번째 학생 점수 입력", i+1);
			com[i] = sc.nextInt();
		}
		
	
		//출력
		for(int i=0; i<com.length; i++) {
			System.out.printf("%d, ", com[i]);
		}
	
		System.out.println("");
		
		//데이터 역순 출력
		for(int i=0; i<com.length; i++) {
			System.out.printf("%d, ", com[com.length-1-i]);
		}
		
		//최대값 최소값 구하기
		
		int max, min;
		max = 0;
		min = 999;
		
		for(int i=0; i<com.length; i++) {
			if (com[i] > max) {
				max = com[i];
			}
			if(com[i] < min) {
				min = com[i];
			}
		}
		System.out.println("\n최대값 : " + max + "\n최소값 : "  + min);

		//총점 구하기
		int sum = 0;
		for(int i=0; i<com.length; i++) {
			sum += com[i];
		}
		System.out.println("총점 : " + sum );
		
		
		//평균 구하기
		double avg = 0;
		avg = (double)sum/com.length;
		System.out.println("평균 : " + avg );
	
		
		//정렬 드디어 성공했더ㅣㅣ....
		for(int i=0; i<com.length; i++) {//정렬범위를 잡아주는 부분
			for (int j=0; j<com.length-1-i; j++) {
				if (com[j] > com[j+1]) {
					int tmp = com[j];
					com[j] = com[j+1];
					com[j+1] = tmp;
				}
			}
		}
		for(int i=0; i<com.length; i++) {
			System.out.printf("%d, ", com[i]);
		}
		

		
		
		
	}

}
