package Day32PredefindClasses;

public class BoxingOperation2 {

	public static void main(String[] args) {
		
		char C1='A';
		
		Character charObj1=new Character(C1);//explicit boxing
		System.out.println("charObj1 : "+C1);
		System.out.println(C1==charObj1);
		Character charObj2=new Character('Z');
		
		Character charObj3='H';//implicit or auto boxing
		
		System.out.println("C1 : "+C1);
		System.out.println("charObj1 : "+charObj1);
		System.out.println("charObj2 : "+charObj2);
		System.out.println("charObj3 : "+charObj3);
		
		boolean b=true;
		Boolean bObj=new Boolean(b);
		System.out.println(bObj==b);
		

	}

}
