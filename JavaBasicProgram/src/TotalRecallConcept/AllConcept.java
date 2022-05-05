package TotalRecallConcept;

public class AllConcept {
	static int age1=35;
	int age2=56;
	static double salary1=25000.56;
	double salary2=30000.20;

	public static void main(String[] args) {
		System.out.println("SGV is " +AllConcept.age1);
		System.out.println("SGV is " +AllConcept.salary1);
		System.out.println("****Static Global Variable****");
		
		AllConcept ref=new AllConcept ();
		System.out.println("NSGV is " +ref.age2);//56
		System.out.println("NSGV is " +ref.salary2);
		System.out.println("***Non-static global variable***");
		
		// classname ref=new classname();--->declaration of non static varaiable
		AllConcept D1=new AllConcept ();
		D1.display();
		D1.scope();
		
		//classname.variablename ---> declaration Static variable
		AllConcept.display2();
	
		// classname ref=new classname();----> declaration of non static variable
		AllConcept D2=new AllConcept ();
		D2.scope1(36,98);
		D2.combination(45000, 6.7f, 36);//return type
		D2.display3();
		
		System.out.println("========Overloading type=======");
	    //classname ref=new classname();
		AllConcept TMD=new AllConcept();
		TMD.overload(125.7f);
		TMD.overload(56,88.5f,5);
		
		
		
	}
	void display() { //non-static[defoult]
		System.out.println("Hello Amravati,I'm Sarang");
	}
	static void display2() {
		System.out.println("Welcome to Java programm");
	}
	public void scope() {
		System.out.println("No parameter");
	}
	public void scope1(int num1,float num2) {
		double result1=num1*num2;
		System.out.println("Multiplication of two num =" +result1);
	}
	double combination(double p,float r,int t) {
		double result2=(p*r*t)/100;
		System.out.println(result2);
		return result2;
	}
	void display3() {
		System.out.println();
	}
	public void overload(float F1) {
		double result3=((F1-32)*5)/9;
		System.out.println(result3+"'C");
	}
	public void overload(int num1, float num2, int num3) {
		float result4=(num1*num2)/num3;
		System.out.println("multiplication and division of num =" + result4);
	}
	

}
