/* This is printer class */

package interfacecompo;

public class Printer implements IMachine{

	//Good to have private class variables
	
	
	private String modelNumber;
	
	//create object of papertray here
	private PaperTray paperTray = new PaperTray();
	private Machine machine;
	
	public Printer(boolean isOn,String modelNumber){
		
		machine = new Machine(isOn);
		this.modelNumber = modelNumber;
	}
	
	//polymorphism
	
	public void turnOn(){
		
		machine.turnOn();
	}
	
	public void print(int copies){
		
		
		//use of papertray method isEmpty()
		while(copies > 0 && !(paperTray.isEmpty())){
			
			System.out.println("Printer on status: "+machine.isOn);
			System.out.println("Model number is :" + modelNumber);
			copies--;
			paperTray.pages--;
		}
	    if(paperTray.isEmpty()){
	    	
	    	System.out.println("PaperTray is empty !!!");
	    }
	}
	
	public void loadPaper(int paper){
		
		paperTray.addPaper(paper);
	}
	public String getModelNumber(){
		
		return modelNumber;
	}

	
	public void turnOff() {
		machine.turnOff();
		
	}
}
