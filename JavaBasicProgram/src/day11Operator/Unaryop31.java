package day11Operator;

public class Unaryop31 {

	public static void main(String[] args) {
		int p =78, q;
		q = p + ++p + p++ + --p + p-- + p++ + p--;
		// q= 78 + 79 +79 + 79 + 79 + 78 + 79
		System.out.println("p :" + p);//78
		System.out.println("q :" + q);//551
		
		System.out.println("*******************************");
		p=-108;
		q= --p + p++ + p-- + ++p + p++ + p + p++;
		//q= -109 + -109 + -108 + -108 + -108 + -107 + -107
		System.out.println("p :" +  p);//-106
		System.out.println("q :" +  q);//-756
		  
		System.out.println("******************************");

	}

}
