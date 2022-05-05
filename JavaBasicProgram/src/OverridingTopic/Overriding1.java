package OverridingTopic;

class laptop {
	void method1 () {
		System.out.println("i'm using method1 in laptop MSI");
	}
}
class MSI extends laptop{
	void method1 () {
		System.out.println("i'm using method1 in realme mobile");
	}
	void method2 () {
		System.out.println("Many people use laptop different different company as per people requirement");
	}
}
public class Overriding1 {

	public static void main(String[] args) {
		laptop ref11=new laptop();
		ref11.method1();
		
		System.out.println("***********************overriding*******************************");
		MSI ref12=new MSI();
		ref12.method1();
		ref12.method2();
		
		System.out.println("********************when parent refers**************************");
		laptop ref13=new MSI();
		ref13.method1();
		

	}

}
