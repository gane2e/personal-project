package work;

public abstract class Plane {
	
	private String planeName;
	private int fuelSize;
	
	public Plane() {}
	public Plane(String planeName,  int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	
	public void refuel(int fule){
		setFuelSize(getFuelSize() + fule);
	}
	public void flight(int distance){
	}
	
	
	///////getter setter
	public String getPlaneName() {
		return planeName;
	}
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}
	public int getFuelSize() {
		return fuelSize;
	}
	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	///////getter setter

	
}
