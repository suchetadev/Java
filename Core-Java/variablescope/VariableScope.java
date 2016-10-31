/* This program demonstrate scope of variables */

package variablescope;

public class VariableScope {
	
	//variable at class level
	private static int age = 50;
	public static void main(String args[]){
		
		//this is block and age = 25 has scope for block only
		{
			int age = 25;
			System.out.println("Age is :" + age);
		}
		
		//int age = 20;
		System.out.println("Age is :" + age);
	}

}
