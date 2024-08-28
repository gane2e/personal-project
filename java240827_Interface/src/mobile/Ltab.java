package mobile;

public class Ltab extends Mobile {

	public Ltab() {}
	public Ltab(String mobileName,  int betterySize, String osType) {
		super(mobileName, betterySize,osType);
	}
	@Override
	public void operate(int time) {
		int tmp = getBetterySize() - time*10;
		setBetterySize(tmp);
		
	}
	@Override
	public void charge(int time) {
		int tmp = getBetterySize() + time*10;
		setBetterySize(tmp);
	}
}
