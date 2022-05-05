package day14Condition;

public class LogicalProgram1 {
	void even() {
		int count=0;
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				//System.out.println(i);
				count=count+1;
				System.out.println("Its even number " +i);
			}
		}
		System.out.println("total number of even numbers are " + count);
	}
   static void odd() {
    	System.out.println("****************************************");
		int count=0;
		for(int i=1; i<=100;i++) {
			if(i%2!=0) {
				count=count+1;
				System.out.println("Its odd number " +i);
			}
		}
		System.out.println("total number of odd number are " + count);
	}

	public static void main(String[] args) {
		
		LogicalProgram1 ref1=new LogicalProgram1();
		ref1.even();
		LogicalProgram1.odd();
		

	}

}
