package day06;

import java.util.Stack;

public class StackExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> s = new Stack<>();
		
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");
		s.push("e");
		s.push("f");
		int size = s.size();
		
		for(int i=0;i<size;i++){
			System.out.println(s.pop());
		}

	}

}
