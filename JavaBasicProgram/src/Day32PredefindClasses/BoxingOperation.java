package Day32PredefindClasses;

public class BoxingOperation {

	public static void main(String[] args) {
		int age=20;
		System.out.println("age : "+age);
		Integer intObj1=new Integer(age);//explicit boxing operation
		System.out.println("intObj1 : "+intObj1);
		
		System.out.println(age==intObj1);
		
		Integer intObj2=new Integer(50);//explict boxing opertion
		System.out.println("intObj2 : "+intObj2);
		Integer intObj3=30;//implict boxing operation or auto boxing operation
		System.out.println("intObj3 : "+intObj3);
		
		System.out.println("intObj1==intObj2 : "+(intObj1==intObj2));
		System.out.println("intObj2.equals(intObj3) : "+intObj2.equals(intObj3));
		

	}

}
