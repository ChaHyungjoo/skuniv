package day03;

class Car3 {
	String name;
	int speed;
	static int numberOfCars;
	
	public Car3(){
		name = "MyCar";
		speed = 0;
		numberOfCars++;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}


public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car3 mcqueen = new Car3();
		System.out.println(Car3.numberOfCars+" 대의 차가 생산되었습니다.");
		Car3 hudson = new Car3();
		Car3 marter = new Car3();
		System.out.println(Car3.numberOfCars+" 대의 차가 생산되었습니다.");
		

	}

}
