package day05;

public class Car {
	private String name;
	private int speed;
	
	public Car(String name, int speed){
		this.name = name;
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Car [name="+name+", speed="+speed+"]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null){
			if(obj instanceof Car){
				Car c = (Car)obj;
				if(name.equals(c.name)&&speed==c.speed){
					return true;
				}
			}
		}
		return false;
	}

}
