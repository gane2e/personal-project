package mobile;

public abstract class Mobile {

	private String mobileName;
	private int betterySize;
	private String osType;
	
	public Mobile(){}
	public Mobile(String mobileName,  int betterySize, String osType){}
	
	public void operate(int time) {}
	public void charge(int time) {}

	//getter
	public String getMobileName() {
		return mobileName;
	}
	public int getBetterySize() {
		return betterySize;
	}
	public String getOsType() {
		return osType;
	}
	
	//setter
	public void setMobileName(String name) {
		this.mobileName = mobileName ;
	}
	public void setBetterySize(int betterySize) {
		this.betterySize = betterySize ;
	}
	public void OsType(String osType) {
		this.osType = osType ;
	}

	
}
