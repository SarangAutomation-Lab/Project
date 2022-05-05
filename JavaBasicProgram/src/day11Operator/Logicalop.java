package day11Operator;

public class Logicalop {

	public static void main(String[] args) {
		// variable defination and  initialization 
		int age=18;
		char bloodgroup='A';
		boolean res1, res2;
		res1= (age>18);
		res2=(bloodgroup=='A');
		
		System.out.println("Result1 :" + res1);//false
		System.out.println("Result2 :" + res2);//ture
		//Logical AND
		System.out.println("bool1 && bool2 =" + (res1 && res2));//false
		//LOgical OR
		System.out.println("bool1 || bool2 =" + (res1 || res2));// ture
		//Logical Not
		System.out.println("!(bool1 && bool2) =" + !(res1 && res2));//ture

	}

}
