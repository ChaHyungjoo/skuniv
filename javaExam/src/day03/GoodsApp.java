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
		
		System.out.print("��ǰ�̸� �Է�: ");
		camera.setName(sc.next());
		System.out.print("�� �Է�: ");
		camera.setPrice(sc.nextInt());
		System.out.print("����� �Է�: ");
		camera.setPrice(sc.nextInt());
		System.out.print("�ȸ����� �Է�: ");
		camera.setPrice(sc.nextInt());
		*/
		camera.setName("Nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		
		
		System.out.println("������:");
		System.out.println("��ǰ�̸�: "+camera.getName());
		System.out.println("��ǰ����: "+camera.getPrice());
		System.out.println("������: "+camera.getCountStock());
		System.out.println("�ȸ�����: "+camera.getCountSold());
		

	}

}
