/* Main class contains main method */

package polymorphism;

public class MainClass {
	
	public static void main(String args[]){
		
		//depending upon the type of object method will get called
		
		//Machine machine = new Printer(true,"ABC");
		
		Machine machine = new Machine(true);
	
		machine.turnOn();
		
	}

}
