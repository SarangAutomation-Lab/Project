package practices1;

public class Assignment2 {
     int rollno=550;
     int age=30;
     int weight=75;
     static int mob=992267;
     static double salary=65000;
     static char grade='A';
	public static void main(String[] args) {
		System.out.println("SGV with mob std :" + Assignment2.mob);
		System.out.println("SGV with salary std :" + Assignment2.salary);
		System.out.println("SGV with grade std :" + Assignment2.grade);
		System.out.println("************* static global variable ************ ");
		
		Assignment2 X1=new Assignment2();
		System.out.println("NSGV with rollno std :" + X1.rollno);
		System.out.println("NSGV with age std :" + X1.age);
		System.out.println("NSGV with weight std :" + X1.weight);
		System.out.println("*********NSGV*************************************");
		
		mob=87888;
		grade='D';
		System.out.println("Replace mob :"+ Assignment2.mob);
		System.out.println("Replace grade :"+ Assignment2.grade);
		
		int age=65;
		int weight=60;
		System.out.println("Replace age :"+ X1.age);
		System.out.println("Replace weight :" +X1.weight);

	}

}
