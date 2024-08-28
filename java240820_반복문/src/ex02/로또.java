package ex02;

import java.util.Random;

public class 로또 {

	public static void main(String[] args) {
	
		int[] lotto = new int[6];
		Random ran = new Random();
		
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<6; j++) {
				int tmp = ran.nextInt(45)+1;
				boolean flag = false;
				
				
				for(int k=0; k>j; k++) {
					
					if(lotto[k] == tmp)
						flag = true;
					j--;
					} 
					if (flag == false) {
						lotto[j] = tmp;
						System.out.print(lotto[j] + ", ");
				}
					
					
			}
			System.out.println();	
		}

	}

}
