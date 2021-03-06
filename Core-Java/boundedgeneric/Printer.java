/* This is printer class
 * We want printer consist of print cartriadge
 * We will create printer of generic type T */

package boundedgeneric;

public class Printer <T extends ICartridge> implements IMachine{
	
	
	private String modelNumber;
	private Machine machine;
	private T cartridge;
	
	
	//create object of papertray here
	private PaperTray paperTray = new PaperTray();
	
	public Printer(boolean isOn,String modelNumber,T cartridge){
		
		machine = new Machine(isOn);
		this.modelNumber = modelNumber;
		this.cartridge  = cartridge;
	}
	
	//polymorphism
	
	public void turnOn(){
		
		machine.turnOn();
	}
	
	//generic method
	public<U extends ICartridge> void printUsingCart(U cart, String msg){
		
		System.out.println(cart.toString());
		System.out.println(msg);
		System.out.println(cart.getFillPercentage());
	}
	
	
	
	public void print(int copies){
		
		System.out.println(cartridge.toString());
		
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
