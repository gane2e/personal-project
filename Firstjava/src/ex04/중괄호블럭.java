/*
 * 이클립스 단축키
 * 줄복사 : Ctrl + Alt + 상,하 방향키
 * 줄삭제 : Ctrl + d
 * 줄이동 : alt + 방향키 (상, 하)
 * 창분할 : Ctrl + Shift + [(토클기능)]
 * 
 * 화면확대 : Ctrl + M
 * 윈도우키 + shift + S --> 캡쳐가능
 */
package ex04;

public class 중괄호블럭 {

	public static void main(String[] args) {
		
		int n = 100;
		n = 200;

		int kor = 10;
		System.out.println(kor);
		
		
		{
			//블럭 안 내용은 블럭 내에서만 사용 가능***
			int num = 10;
			System.out.println(num);
			System.out.println(kor);
		}
		{
			int num2 = 20;
			System.out.println(num2);
			System.out.println(kor);
		}
		{
			int num2 = 30;
			System.out.println(num2);
			System.out.println(kor);
		}

		System.out.println("kor");
		System.out.println("kor");
		
	}

}
