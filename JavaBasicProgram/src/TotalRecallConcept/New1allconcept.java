package TotalRecallConcept;

public class New1allconcept {
	int mobile=982222;
	char grade='A';
	static int empId=55555;
	static double salary=50000;
	public static void main(String[] args) {
		System.out.println("SGV empId :" + New1allconcept.empId);
		System.out.println("SGV salary :" + New1allconcept.salary);
		System.out.println("==================================");
		
		New1allconcept data=new New1allconcept();
		System.out.println("NSGV is Mobile :" + data.mobile); 
		System.out.println("NSGV is grade :" + data.grade);
		System.out.println("==================================");
		
		New1allconcept.program1();
		New1allconcept.refrigerator(450f,150f);
		
		New1allconcept cop=new New1allconcept();
		cop.refrigerator1(98f,55f);
		cop.refrigerator1(750000,8.9f,24);
		cop.program2();
		cop.program2(20,5,35,15);
		
	}
	static void program1() {
      System.out.println("I'm bieginner to learn Automation testing ");
    }
	static void refrigerator(float t1,float t2) {
		float cop1=(t2/(t1-t2));
		System.out.println("Refrigerator COP :" + cop1);
    }
	 void refrigerator1(float t1,float t2) {
		 float cop2=(t2/(t1-t2));
		 System.out.println("Refrigerator COP2 :" +cop2);
	}
	 void refrigerator1(int p,float r,int t) {
		 float result=(p*r*t)/100;
		 System.out.println("Simple interest :" + result);
	}
	 double program2() { 
		 System.out.println("hello,good morning"); 
		 return grade;
    }
	 int program2(int num1, int num2,int num3, int num4) {
		 System.out.println("********multipal operetion start*******");
		 System.out.println("********multipal operation end*********");
		 return (num1*num2)/(num3+num4);
	 }
}