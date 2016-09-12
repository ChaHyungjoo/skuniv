package day04;

abstract class Shape1{
	public abstract void calculateArea();
}
class Circle1 extends Shape1{
	@Override
	public void calculateArea() {
		System.out.println("��");
	}
}
class Triangle1 extends Shape1{
	@Override
	public void calculateArea() {
		System.out.println("�ﰢ��");
	}
}
class Rectangle1 extends Shape1{
	@Override
	public void calculateArea() {
		System.out.println("���簢��");
	}
}
public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 c = new Circle1();
		Triangle1 t = new Triangle1();
		Rectangle1 r = new Rectangle1();
		
		c.calculateArea();
		t.calculateArea();
		r.calculateArea();

	}

}
