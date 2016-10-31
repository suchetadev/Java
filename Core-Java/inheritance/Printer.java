/* This is printer class */

package inheritance;

public class Printer extends Machine{

	//Good to have private class variables
	
	private String modelNumber;
	
	public Printer(boolean isOn,String modelNumber){
		super(isOn);
		this.modelNumber = modelNumber;
	}
	

	public void print(){
		System.out.println(isOn);
		System.out.println("Model number is :" + modelNumber);
		//print("Hello printer");
	}
	
	//make it private
	private void print(String text){
		System.out.println(text);
	}
	
	public String getModelNumber(){
		
		return modelNumber;
	}
}
