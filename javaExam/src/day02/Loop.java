package day02;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = Integer.parseInt(args[0]);
		int output = 0;
		
		while(true)
		{
			output += input;
			input--;
			if(input==0) break;
		}
		System.out.println(output);

	}

}
