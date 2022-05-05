package AbstractionTopic;

abstract class shape{
	abstract void draw();
}
//In really scenario, implementation is provided by other i.e unknown by user
class Rectangle extends shape{
	protected void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class circle1 extends shape{
	public void draw() {
		System.out.println("Drawing circle");
	}
	
}
public class Abstract_class02 {

	public static void main(String[] args) {
		shape q=new Rectangle();
		q.draw();
		
		shape p=new circle1();
		p.draw();

	}

}
