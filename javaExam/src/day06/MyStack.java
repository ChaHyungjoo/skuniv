package day06;

import java.util.Stack;
import java.util.Vector;

public class MyStack <E>{
//	private Vector<E>
	private Stack<E> stack = new Stack<>();
	public boolean empty() {
		return stack.empty();
	}

	public synchronized E peek() {
		return stack.peek();
	}

	public synchronized E pop() {
		return stack.pop();
	}

	public E push(E item) {
		return stack.push(item);
	}
	
	public int size(){
		return stack.size();
	}

	public static void main(String[] args) {
		
		

	}

}
