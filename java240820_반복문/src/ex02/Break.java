package ex02;

public class Break {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i == 5)
				continue; //컨티뉴를 만난 실행작업은 아래 코드를 실행하지 않음.
			System.out.println("나를 반복하렴" + i);
		}

	}

}
