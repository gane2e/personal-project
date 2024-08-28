//1~10까지 2와 3의 배수를 제외 한 숫자를 출력
package ex02;

public class Continue2 {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i % 2 == 0 || i % 3 == 0 )
				continue;
			System.out.println( i + ", ");
		}

	}

}
