package AbstractionTopic;

abstract class bike1{
	abstract void run();
	void speed(int speed) {
		System.out.println("Bike Speed" + speed);
	}
}
class Honda01 extends bike1{
	void run() {
		System.out.println("Running safely");
	}
	void colour() {
		System.out.println("Honda bike colour is blue");
	}
}

public class Abstract_class01 {

	public static void main(String[] args) {
		Honda01 ref1=new Honda01();
		ref1.colour();
		ref1.speed(20);
		ref1.run();
		
		//bike1 ref3=new bike1();
		bike1 ref2=new Honda01();
		ref2.run();
		ref2.speed(50);
		

	}

}
