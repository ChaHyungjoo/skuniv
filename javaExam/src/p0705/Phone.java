package p0705;

import java.util.*;

public class Phone {
	private String name;
	private String tel;
	public Phone(String name, String tel){
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름과 전화번호 입력: ");
		Phone p1 = new Phone(sc.next(), sc.next());
		System.out.print("이름과 전화번호 입력: ");
		Phone p2 = new Phone(sc.next(), sc.next());
		System.out.println(p1.getName()+"의 번호: "+p1.getTel());
		System.out.println(p2.getName()+"의 번호: "+p2.getTel());
		

	}

}
