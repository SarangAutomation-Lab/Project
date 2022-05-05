package InheritanceTopic;

class vehicle {
	int a=90;
	static long mobileNo =88885017;
	void method1() {
		System.out.println("hi this is a  method1 vehicle A");
	}
}
	class car extends vehicle {
		int no=2020;
		static int PRNno=889;
		static char d='B';
		void method2 () {
			System.out.println("hi this is a method2 car model Qoo6");
		}
		int method3() {
			return 504;
		}
	}


public class Inheritance02 {

	public static void main(String[] args) {
		vehicle ref1=new vehicle();
		ref1.method1();
		System.out.println(ref1.a);
		System.out.println(vehicle.mobileNo);
		
		car ref2=new car();
		ref2.method1();
		ref2.method2();
		System.out.println(ref2.no);
		System.out.println(car.PRNno);
		System.out.println(car.d);
		
		int ans=ref2.method3();
		System.out.println(ans);
		

	}

}
