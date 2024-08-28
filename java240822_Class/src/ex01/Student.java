package ex01;

public class Student {
	
	private String department;//학과
	private int classof;//학번
	
	Student(String department, int classof){
		this.department = department;
		this.classof = classof;
	}
	
	public void getDepartment() {
		return;
	}
	
	void setDepartment(String department) {
		this.department = department;
	}
	
	public void getClassof() {
		return;
	}
	
	void setClassof(int classof) {
		this.classof = classof;
	}
	
	
	void info() {
		System.out.println(department + classof);
	}

}
