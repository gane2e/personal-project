package ex02;

import java.util.Scanner;

public class Grade {

	int math, science, english;
	
	Grade(int math, int science, int english){
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public int avg(){
		return (math+science+english)/3;
	}
	
}
