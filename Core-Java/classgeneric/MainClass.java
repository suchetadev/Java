/* Main class contains main method 
 * In this case if another type of machine is there we have to write turnOn() definition
 * in each one so repetition of code is there 
 * so we will make machine to implement interface and create instance of machine inside printer in 
 * 					interfacecompo  
 * 
 * */

package classgeneric;

public class MainClass {
	
	public static void main(String args[]){
		
		//method call from printer
		
		Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true,"ABC",new ColorCartridge());
		
		printer.print(1);
		
	}

}
