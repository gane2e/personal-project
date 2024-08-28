package work;

public class Cargopla extends Plane{
	
	public Cargopla(){}
	public Cargopla(String planeName,  int fuelSize){
		super(planeName,fuelSize);
	}

	@Override
	public void flight(int distance){
	
		int count =  distance/10;
		setFuelSize(getFuelSize() - count*50);
		
	} 

}
