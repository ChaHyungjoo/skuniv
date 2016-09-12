package day03;

class ArrayUtils{
	static double[] intToDouble(int[] source){
		double[] resultArr = new double[source.length];
		for(int i=0;i<source.length;i++)
		{
			resultArr[i] = source[i];
		}
		
		return resultArr;
	}
	static int[] doubleToInt(double[] source){
		int[] resultArr = new int[source.length];
		for(int i=0;i<source.length;i++)
		{
			resultArr[i] = (int) source[i];
		}
		
		return resultArr;
	}
	static int[] concat(int[] s1, int[] s2){
		int[] resultArr = new int[s1.length+s2.length];
		for(int i=0;i<resultArr.length;i++){
			resultArr[i] = s1[i]+s2[i];
		}
		
		return resultArr;
	}
}


public class ArrayUtilsTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayUtils arr = new ArrayUtils();
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		
		int n = arr1.length+arr2.length;
		
		System.out.println(n);
		/*
		int[] arr3 = arr.concat(arr1, arr2);
		for(int i=0;i<n;i++){
			System.out.println(arr3[i]);
		}
		*/

	}

}
