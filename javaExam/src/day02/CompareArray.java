package day02;

public class CompareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		int[] b = {1,2,3,4,5};
		
		System.out.println(equals(a,b));
	}
	public static boolean equals(int[] a, int[] b)
	{
		if(a.length!=b.length) return false;
		else
		{
			for(int i=0; i<a.length;i++)
			{
				if(a[i]!=b[i]) return false;
			}
		}
		return true;
	}

}
