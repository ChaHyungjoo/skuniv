package day04;


class Point{
	public int x;
	public int y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
		//System.out.println("Point의 기본생성자");
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
		System.out.println("좌표 x="+this.getX()+", "+"y="+this.getY()+"에 점을 그렸습니다.");
	}
	void show(boolean visible){
		if(visible){
			System.out.println("좌표 x="+this.getX()+", "+"y="+this.getY()+"에 점을 그렸습니다.");
		}
		else{
			System.out.println("삭제");
		}	
	}
}
class ColorPoint extends Point{
	public String color;
	public ColorPoint(){
		super(0,0);
		//System.out.println("ColorPoint의 기본생성자");
	}
	public ColorPoint(int x, int y, String color){
		super(x,y);
//		setX(x);
//		setY(y);
		this.color = color;
		//System.out.println("ColorPoint의 매개변수 생성자");
	}
	@Override
	public void show(){
		System.out.println("좌표 x="+this.getX()+", "+"y="+this.getY()+", color="+this.color+"에 점을 그렸습니다.");
	}
	
}
class Shape{
	public void draw(){
		System.out.println("구체적인 도형을 그릴 수 없습니다. 상속에서 재정의하세요.");
	}
}
class Rect extends Shape{
	@Override
	public void draw(){
		System.out.println("사각형을 그렸습니다.");
	}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("원을 그렸습니다.");
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

