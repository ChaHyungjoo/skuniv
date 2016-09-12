package day03;
import java.util.*;

class Goods{
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock){
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold){
		this.countSold = countSold;
	}

}


public class GoodsApp {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods();
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품이름 입력: ");
		camera.setName(sc.next());
		System.out.print("값 입력: ");
		camera.setPrice(sc.nextInt());
		System.out.print("재고개수 입력: ");
		camera.setPrice(sc.nextInt());
		System.out.print("팔린개수 입력: ");
		camera.setPrice(sc.nextInt());
		*/
		camera.setName("Nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		
		
		System.out.println("실행결과:");
		System.out.println("상품이름: "+camera.getName());
		System.out.println("상품가격: "+camera.getPrice());
		System.out.println("재고수량: "+camera.getCountStock());
		System.out.println("팔린수량: "+camera.getCountSold());
		

	}

}
