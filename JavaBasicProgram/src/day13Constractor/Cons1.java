package day13Constractor;

public class Cons1 {
	Cons1() {
		System.out.println("This is a zero- para constructor");
	}
	Cons1(char c) {
		System.out.println("This is a single - para constructor");
	}
	Cons1(int num1, int num2) {
		System.out.println("This is a int-int parameterized constructor");
	}
	Cons1(double num1, int num2) {
		System.out.println("This is a double-int parametrized constructor");
	}
	Cons1(int num1,double num2) {
		System.out.println("this is a int double parametrized constructor");
	}
	Cons1(double num1,boolean num2, char c) {
		System.out.println("this is a double int parametrizied constructor");
	}

	public static void main(String[] args) {
		Cons1 p1=new Cons1();
		Cons1 p2=new Cons1(10,20);
		Cons1 p3=new Cons1(20,45.50);
		Cons1 p4=new Cons1(33.70,30);
		Cons1 p5=new Cons1('D');
		//Cons1 p6=new Cons1( 45,ture,'G');
	}

}
