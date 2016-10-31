/* This is printer class */

package polymorphism;

public class Printer extends Machine{

	//Good to have private class variables
	
	private String modelNumber;
	
	//create object of papertray here
	private PaperTray paperTray = new PaperTray();
	
	public Printer(boolean isOn,String modelNumber){
		
		super(isOn);
		this.modelNumber = modelNumber;
	}
	
	//polymorphism
	@Override
	public void turnOn(){
		
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
}
