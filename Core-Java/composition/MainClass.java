/* Main class contains main method */

package composition;

public class MainClass {
	
	public static void main(String args[]){
		
		Printer myPrinter = new Printer(true,"ABC");
		
		myPrinter.loadPaper(3);
		myPrinter.print(4);
		
	}

}
