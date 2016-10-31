/* Main class contains main method */

package inheritance;

public class MainClass {
	
	public static void main(String args[]){
		
		Printer myPrinter = new Printer(true,"ABC");
		myPrinter.print();
		
		//can access method from machine 
		myPrinter.turnOff();
		
		myPrinter.print();
		
	}

}
