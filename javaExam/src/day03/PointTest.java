package day03;

class Point{
	private int x;
	private int y;
	
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




public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		p.setX(2);
		p.setY(5);
		
		//System.out.println();
		//p.show();
		p.show(false);

	}

}
