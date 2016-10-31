/* Main class contains main method 
 * In this case if another type of machine is there we have to write turnOn() definition
 * in each one so repetition of code is there 
 * so we will make machine to implement interface and create instance of machine inside printer in 
 * 					interfacecompo  
 * 
 * */

package wildcards;

public class MainClass {
	
	public static void main(String args[]){
		
		//method call from printer
		
		Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true,"ABC",new ColorCartridge());
		
		printOne(printer);
	}

	public static void printOne(Printer<? extends ICartridge> printer){
		
		String fillPercentage = printer.getCartridge().getFillPercentage();
		System.out.println(fillPercentage);
	}
}
