/* Main class contains main method */

package overloading;

public class MainClass {
	
	public static void main(String args[]){
		
		Printer myPrinter = new Printer();
		myPrinter.isOn = true;
		myPrinter.modelNumber = "ABC";
		
		System.out.println(myPrinter.isOn);
		myPrinter.print();
		
		myPrinter.print("Hello printer");
		
		System.out.println(myPrinter.getModelNumber());
	}

}
