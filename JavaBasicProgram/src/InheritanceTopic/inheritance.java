package InheritanceTopic;
 class A1 {
	 int age=30;
	 static int value=304;
			 
 }
 class B1 extends A1 {
	 int a=40;
	 int b=50;
	 static int c=70;
	 char d='A';
 }
 class C1 extends B1 {
	 int x=10;
	 double y=40.45;
	 static int z=90;
 }
	 
public class inheritance {

	public static void main(String[] args) {
	System.out.println(A1.value);
	System.out.println(B1.c);
	System.out.println(C1.z);

	C1 ref=new C1();
	System.out.println(ref.age);
	System.out.println(ref.a);
	System.out.println(ref.b);
	System.out.println(ref.d);
	System.out.println(ref.x);
	System.out.println(ref.y);
	}

}
