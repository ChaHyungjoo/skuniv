package day05;

class Rect{
	private int width;
	private int height;
	private int result;
	
	public Rect(int width, int height){
		this.width = width;
		this.height = height;
		result = this.width*this.height;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null){
			if(obj instanceof Rect){
				Rect r = (Rect)obj;
				if(result==r.result){
					return true;
				}
			}
		}
		
		return false;
	}
}


public class LangTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect a = new Rect(2,3);
		Rect b = new Rect(3,2);
		
		if(a.equals(b)) System.out.println("a와 b는 같다.");
		
		

	}

}
