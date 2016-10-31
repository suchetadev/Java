/* This is printer class */

package constructor;

public class Printer {

	//Good to have private class variables
	private boolean isOn;
	private String modelNumber;
	
	public Printer(boolean isOn, String modelNumber){
		
		this.isOn = isOn;
		this.modelNumber = modelNumber;
	}
	
	public void print(){
		System.out.println(isOn);
		System.out.println("Model number is :" + modelNumber);
		print("Hello printer");
	}
	
	//make it private
	private void print(String text){
		System.out.println(text);
	}
	
	public String getModelNumber(){
		
		return modelNumber;
	}
}
