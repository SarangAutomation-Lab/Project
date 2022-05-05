package Day32PredefindClasses;

public class WrapperClasses {
	
	public static void main(String[] args) {
		int a=30;
		//convrting int into Integer 
		Integer k=new Integer(a); //converting int into Integer explicitly
		Integer l=new Integer(30); //converting int into INteger Explicity
		Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally
        System.out.println("a: "+a+"\nk: "+k+"\nl: "+l+"\nj: "+j);
        
        System.out.println("*****Unboxing of boxed object********");
        //converting Integer to int
        Integer a1=new Integer(5);
        int i1=a1.intValue();//converting Interger to int explicitly
        System.out.println("a1: "+a1+"\ni1: "+i1);
        
        System.out.println("a1==i1 :"+(a1==i1));
        System.out.println("k==a1  :"+(k==a1));
        System.out.println("a1.equals(i1) :"+a1.equals(i1));
        System.out.println("J.equals(a1)  :"+j.equals(a1));
	}

}
