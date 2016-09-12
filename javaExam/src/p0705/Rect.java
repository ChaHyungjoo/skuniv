package p0705;

import java.util.*;

public class Rect {
	private int width, height;
	public Rect(int width, int height){
		this.width = width;
		this.height = height;
	}
	public int getArea(){
		return width*height;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[4];
		int i, n;
		
		for(i=1;i<5;i++){
			Scanner sc = new Scanner(System.in);
			System.out.print(i+" 너비와 높이>> ");
			Rect p = new Rect(sc.nextInt(),sc.nextInt());
			n = p.getArea();
			arr[i-1] = n;
		}
		//System.out.println(arr[0]);
		
//		Scanner sc = new Scanner(System.in);
//		Rect p = new Rect(sc.nextInt(),sc.nextInt());

	}

}
