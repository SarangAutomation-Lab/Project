package day11Operator;

public class Unarypractices {

	public static void main(String[] args) {
		int x=68, y;
		y= x--;
		System.out.println(x);//67
		System.out.println(y);//68
		
		int a=x;
		 int b;
		 b=++a;
		 System.out.println(a);//68
		 System.out.println(b);//68

		 int s=-86,t=45,res;
		 res= s-- + ++t;
		 System.out.println(res);// -40
		 System.out.println(s);//-87
		 System.out.println(t);//46
		 
		 int res1=s++ + --t;
		 System.out.println("res1 :" + res1);//-42
		 System.out.println("s :" + s);//-86
		 System.out.println("t :" + t);//45
		 
	}

}
