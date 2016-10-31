/* This is printer class */

package overloading;

public class Printer {

	public boolean isOn;
	public String modelNumber;
	
	public void print(){
		System.out.println("Model number is :" + modelNumber);
		
	}
	
	//overloading of function
	public void print(String text){
		System.out.println(text);
	}
	
	public String getModelNumber(){
		
		return modelNumber;
	}
}
