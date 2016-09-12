package day05;

public class Circle {
	
	int x;
	int y;
	int radius;
	public Circle(int x, int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null){
			if(obj instanceof Rect){
				Circle c = (Circle)obj;
				if(x==c.x&&y==c.y){
					return true;
				}
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
