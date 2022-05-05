package day4.localGlobalVariable;

public class StaticGlobalVariable3 {
    //static global variable 
	static int empId;//default value 
	static double salary;//default value
	static char grade;//default value
	static boolean isPrime;//default value
	public static void main(String[] args) {
		System.out.println("Program starts.....");
		System.out.println("EmpId :" +empId);//0
		System.out.println("Salary :" + salary);//0.0
		System.out.println("Grade:"+ grade);//
		System.out.println("Prime :"+ isPrime);//false
		int age=25;//mandatory to initialize
		System.out.println(age);
		System.out.println("Program ends..........");

	}

}
/**
 * SGV are known as class variable
 * they are loadedd in the memory at the time compilation when the class is getting created
 * As they are class variable,hence in order to access then we can use
 * "classname.staticvariablename" name
 * or we can also access directly from another static method
 * static members will be have single memory
 */
