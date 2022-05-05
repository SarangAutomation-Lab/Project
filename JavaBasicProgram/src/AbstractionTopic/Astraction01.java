package AbstractionTopic;

abstract class demo3{
	abstract void print();
	void method () {
		System.out.println("I'm a non-abstract method (),,,");
	}
}
abstract class demo{
	void method (){
		System.out.println("I'm a non-abstract method(),,,");
	}
	void method2 () {
		System.out.println("I'm a non-abstract method2().....");
	}
}
abstract class demo2{
	abstract void print();
	abstract void print1();
	abstract void print2();
	
}


public class Astraction01  extends demo2{
	void print() {
		System.out.println("Hello");
	}
	void print1() {
		System.out.println("u need to pices of mind");
	}
	void print2() {
		System.out.println(" u need very hard work");
	}

	public static void main(String[] args) {
		
		

	}

}
