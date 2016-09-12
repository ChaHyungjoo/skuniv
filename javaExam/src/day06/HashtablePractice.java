package day06;

import java.util.*;

class Student{
	public String name;
	public double score;
	public double avg;
	public void Sum(double score){
		this.score +=score;
	}
	public double Avg(double score){
		this.avg = (this.score)/5.0;
		return avg;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setScore(double score) {
		this.score = score;
	}

}

public class HashtablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		Hashtable<String, Double> ht = new Hashtable<>();
		for(i=0;i<5;i++){
			System.out.print("이름과 점수를 입력하세요: ");
			String name = sc.next();
			double score = sc.nextDouble();
			ht.put(name, score);
			st.Sum(score);
			
		}
		Enumeration<String> n = ht.keys();
		Enumeration<Double> s = ht.elements();
		System.out.println("");
		while(n.hasMoreElements()){
			System.out.println("이름: "+n.nextElement()+"\t점수: "+s.nextElement());
		}
		System.out.println("=============================");
		System.out.println("\t점수 합계: "+st.score);
		System.out.println("\t점수 평균: "+st.Avg(st.score));

	}

}
