package day13Constractor;

public class Cons0 {
	
	int age=10;
	 Cons0 () {
		 // default constrator written by java compiler at the time of compilation
	 }

	public static void main(String[] args) {
		System.out.println("program start");
		 Cons0 a1= new  Cons0();
		System.out.println(a1.age);
		System.out.println("program end");
		

	}

}
