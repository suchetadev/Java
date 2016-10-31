/* Main class contains main method */

package constructor;

public class MainClass {
	
	public static void main(String args[]){
		
		Printer myPrinter = new Printer(true,"ABC");
		myPrinter.print();
		
		Printer yourPrinter = new Printer(false,"CDG");
		yourPrinter.print();
	}

}
