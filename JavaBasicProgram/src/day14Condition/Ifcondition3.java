package day14Condition;

public class Ifcondition3 {

	public static void main(String[] args) {
		// Creating two variable for age and weight
		int age = 20;
		int weight = 40;
		//applying conditon on age and weight
		if (age >= 18) {
			if (weight > 50) {
				System.out.println("You are eligible to donate blood");
			} else {
				System.out.println("You are not eligible to donate blood");
			}
		}
		

	}

}
