package day20Opps;

class A1 {
	A1() {
		
	}
	static int a=10;
	int b=20;
	double c=13.45;
}
class B1 extends A1{
	B1(){
		 super();
	}
	static int x=30;
	int y=40;
	double z=53.45;
	}
class C1 extends B1 {
	C1() {
		  super();
	}
	static int p=50;
	int q=60;
	double r=66.45;
	}
public class Inheritance1 {
	public static void main(String[] args) {
		/****************Acess stastic member class A member *************************/
		System.out.println("class A1 static variable: " +A1.a);
		/***************Access static member class B members**************************/
		System.out.println("class B1 static variable: " +B1.x);
		/***************Access static member class C member *************************/
		System.out.println("class C1 static variable: " +C1.p);
		/***************Access non-static member class A1,B! & C1 members************/
		
		System.out.println("*********************************************************");
		C1 c1=new C1();
		System.out.println("with class C refer: "+c1.b);
		System.out.println("with class C refer: "+c1.c);
		System.out.println("with class C refer: "+c1.q);
		System.out.println("with class C refer: "+c1.r);
		System.out.println("with class C refer: "+c1.y);
		System.out.println("with class C refer: "+c1.z);
		System.out.println("*********************************************************");
		B1 b1=new B1();
		System.out.println("with class B refer: "+b1.z);
		System.out.println("with class B refer: "+b1.z);
		System.out.println("with class B refer: "+b1.z);
		System.out.println("with class B refer: "+b1.z);
	}

}
