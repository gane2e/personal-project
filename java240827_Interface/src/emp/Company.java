package emp;

public class Company {

	public static void main(String[] args) {

		Secretary secretary = new Secretary("Duke", 1, "secretary", 800);
		Sales sales = new Sales("Tuxi", 2, "    sales", 1200);
		
		Employee[] emp = {secretary, sales}; //Employee 배열에 객체를 할당
		
		
		Company.printEmployee(emp, true);
		
		secretary.incentive(100);
		sales.incentive(100);
		
		Company.printEmployee(emp, false);
		
	}

	public static void printEmployee(Employee[] emps, boolean isTax) {
		
		if(isTax) {
			System.out.println("");
			System.out.println("name     department       salary    extra pay");
			System.out.println("---------------------------------------------");
			
			for(Employee emp : emps) {
				System.out.printf
				("%s\t %s\t  %d\t    %.2f\n", 
						emp.getName() , emp.getDepartment() 
						, emp.getSalary() , emp.getExtraPay());
			}
		
		} else{
			System.out.println("");
			System.out.println("name     department       salary       tax        extra pay");
			System.out.println("-----------------------------------------------------------");
			
			for(Employee emp : emps) {
				System.out.printf
				("%s\t %s\t %d\t      %.2f\t     %.2f\n", 
						emp.getName() , emp.getDepartment() 
						, emp.getSalary() , emp.tax() , emp.getExtraPay());
			}
			
		}
		
		
		
	}
	
}
