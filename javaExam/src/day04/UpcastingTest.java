package day04;

class Student extends Person{
	private String grade;
	private String major;
	
	public Student(){
		super();
		System.out.println("4");
	}
	public Student(String name){
		super(name);
		System.out.println("2");
		
	}
}


public class UpcastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p;
		//Student s = new Student("Â÷ÇüÁÖ");
		Student s = new Student();
		//p = s;
		//System.out.println(p.name);

	}

}
