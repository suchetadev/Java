/* This is printer class */

package interfacespoly;

public class Printer implements IMachine{

	//Good to have private class variables
	
	public boolean isOn;
	private String modelNumber;
	
	//create object of papertray here
	private PaperTray paperTray = new PaperTray();
	
	public Printer(boolean isOn,String modelNumber){
		
		this.isOn = true;
		this.modelNumber = modelNumber;
	}
	
	//polymorphism
	@Override
	public void turnOn(){
		
		isOn = true;
		System.out.println("Printer is turn on");
	}
	
	public void print(int copies){
		
		
		//use of papertray method isEmpty()
		while(copies > 0 && !(paperTray.isEmpty())){
			
			System.out.println("Printer on status: "+isOn);
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

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		isOn = false;
		System.out.println("Printer is turn off");
		
	}
}
