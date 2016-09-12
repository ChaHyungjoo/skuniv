
package day01;

public class HelloWorld {

	public static void main(String[] args) {
		//System.out.println("Hello World!!");
		int i, j, k;
		for(i=1;i<=9;i++)
		{
			for(j=2;j<=9;j++)
			{
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println("");
		}
		System.out.println("");
		for(i=1;i<4;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		for(i=3;i>0;i--)
		{
			for(j=i;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		for(i=1;i<6;i++)
		{
			for(j=6;j-i>0;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
	}

}

