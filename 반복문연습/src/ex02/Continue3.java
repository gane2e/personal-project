//1~10까지 짝수 합 출력 continue 이용
package ex02;

public class Continue3 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=10; i++) {
			if(i % 2 == 1) continue; //2로나눠 1이남는 홀수일경우 sum에 할당하지 않음
			sum += i;
		}
		System.out.println(sum);
	}

}
