/*
 * num1 = 20;
 * num2 = 10;
 * 두 수 교환해서 출력
 */
package ex02;

public class NumberChange {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("befor----------");
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		
		int tmp = num1; //변수의 임시저장소 (tmp도 변수)
		    num1 = num2;
		    num2 = tmp;
		
		System.out.println("after-----------");
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
	}
}
