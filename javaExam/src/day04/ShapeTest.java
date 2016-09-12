package day04;


class Point{
	public int x;
	public int y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
		//System.out.println("Point�� �⺻������");
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	void show(){
		System.out.println("��ǥ x="+this.getX()+", "+"y="+this.getY()+"�� ���� �׷Ƚ��ϴ�.");
	}
	void show(boolean visible){
		if(visible){
			System.out.println("��ǥ x="+this.getX()+", "+"y="+this.getY()+"�� ���� �׷Ƚ��ϴ�.");
		}
		else{
			System.out.println("����");
		}	
	}
}
class ColorPoint extends Point{
	public String color;
	public ColorPoint(){
		super(0,0);
		//System.out.println("ColorPoint�� �⺻������");
	}
	public ColorPoint(int x, int y, String color){
		super(x,y);
//		setX(x);
//		setY(y);
		this.color = color;
		//System.out.println("ColorPoint�� �Ű����� ������");
	}
	@Override
	public void show(){
		System.out.println("��ǥ x="+this.getX()+", "+"y="+this.getY()+", color="+this.color+"�� ���� �׷Ƚ��ϴ�.");
	}
	
}
class Shape{
	public void draw(){
		System.out.println("��ü���� ������ �׸� �� �����ϴ�. ��ӿ��� �������ϼ���.");
	}
}
class Rect extends Shape{
	@Override
	public void draw(){
		System.out.println("�簢���� �׷Ƚ��ϴ�.");
	}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("���� �׷Ƚ��ϴ�.");
	}
}


public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point a,b;
		//a = new Point(2,3);
		//b = new ColorPoint(3,4,"red");
		
		//a.show();
		//b.show();
		Shape rect = new Rect();
		Shape circle = new Circle();
		
		rect.draw();
		circle.draw();

	}

}

