package day05;

class MyObject{
	@Override
	public String toString() {
		return super.toString();
	}
	
}

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyObject myobj = new MyObject();
		Class c = myobj.getClass();
		System.out.println(myobj.getClass().getName());
		System.out.println(myobj.hashCode());
		System.out.println(myobj.toString());
		System.out.println(myobj);
		

	}

}
