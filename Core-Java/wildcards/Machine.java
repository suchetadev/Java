package wildcards;

public class Machine implements IMachine{
	
	protected boolean isOn;
	
	public Machine(boolean isOn){
		
		this.isOn = isOn;
	}

	public void turnOn(){
	
		isOn = true;
		System.out.println("Machine is on");
	}
	
	public void turnOff(){
		
		isOn = false;
		System.out.println("Machine is on");
	}
}
	
	
