package day11Operator;

public class Relation {

	public static void main(String[] args) {
		// Variables Defination and Initialization
		int num1 =19, num2=14;
		System.out.println("num1 :"+ num1 +"--->num2 :"+ num2);//19 14
		// is equal to
		boolean res =(num1 == num2 );//false
		System.out.println("num1==num2 :" +res);//false
		// or
		System.out.println("num1 ==num2:" +(num1==num2));//false
		//or
		System.out.println("num1 == num2 :" +(num1 ==num2));//false
		//is not equal to
		System.out.println("num1 !=num2 :" +(num1 !=num2));//ture
		//Greater than
		System.out.println("num1 > num2 :" +(num1 > num2));//ture
		//less than
		System.out.println("num1 < num2 :" +(num1 < num2));//false
		//Greater than or equal to
		System.out.println("num1 >= num2 :" +(num1 >= num2));//ture
		//less than or equal to 
		System.out.println("num1 <= num2 :" +(num1 <= num2));//false
	}

}
