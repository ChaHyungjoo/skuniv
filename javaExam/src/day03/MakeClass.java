package day03;

class Car{
	String name;
	int speed;
	
	public void setName(String n){
		name = n;
	}
	public void setSpeed(int s){
		speed = s;
	}
	public int getSpeed(){
		return speed;
	}
}

class Book{
	//String author;
	String title;
	int isbn;
	
//	public void setAuthor(String a){
//		author = a;
//	}
	public void setTitle(String t){
		title = t;
	}
	public void setIsbn(int i){
		isbn = i;
	}
}

public class MakeClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MakeClass aa = new MakeClass();
		Car c1 = new Car();
		c1.setName("¾Æ¿ìµð");
		
		System.out.println(c1.name);
		
		

	}

}
