package work;

public class Airplane extends Plane{

	public Airplane(){}
	public Airplane(String planeName,  int fuelSize){
		super(planeName,fuelSize);
	}
	
	@Override
	public void flight(int distance){
	
		int count =  distance/10;
		setFuelSize(getFuelSize() - count*30);
		
	}
	
}
