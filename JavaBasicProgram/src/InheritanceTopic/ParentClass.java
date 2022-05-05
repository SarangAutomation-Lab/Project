package InheritanceTopic;

 class ParentClass {
	int a=40;
	public void method1() {
		System.out.println("ParantClass-method1-->non -static");
	}
 }
	class ChildClass extends ParentClass{
		int b=60;
	public void method2() {
		System.out.println("ChildClass method2-->non static");
	}
}
	public void VeloInheri {




	public static void main(String[] args) {
		ChildClass c= new ChildClass ();

		System.out.println(c.b);
		c.method2();
		
		System.out.println(c.a);
		c.method1();
	}

}
 


