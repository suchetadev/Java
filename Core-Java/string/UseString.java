package string;

public class UseString {

	public static void main(String args[]){
		
		String firstName = "John";
		String fullName = firstName + "Smith";
		
		System.out.println("Full name is " + fullName);
		System.out.println(fullName.length());
		System.out.println(fullName.indexOf('i'));
		
		String gender = new String("Male");
		System.out.println(gender);
		gender = "Female";
		System.out.println(gender);
	}
}
