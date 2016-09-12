package day04;

public interface Drawable {
	public void draw();
}
abstract class Shape2{
	public abstract double calculateArea();
}
class Circle2 extends Shape implements Drawable{
	int r = 3;
	public double calculateArea(){
		return (double)r*r*Math.PI;
	}
	public void draw(){
		System.out.println("이 객체는 원 입니다.");
	}
}

