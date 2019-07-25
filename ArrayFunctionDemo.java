//Array Built in Function Demo

import java.util.Arrays;

public class ArrayFunctionDemo{

	public static void main(String[] ags)
	{
		int[] arr1={1,2,3};
		int[] arr2=new int[3];
		//Copy Array Demo
		System.arraycopy(arr1,0,arr2,0,3);
		System.out.println("Second element in Arr2 "+arr2[1]);
		//copy at different position
		int[] arr3={1,2,3,4,5,6};
		System.arraycopy(arr1,0,arr3,3,2);
		System.out.println("Arr3 elemet at position 4 "+arr3[3]+" and position 6 "+arr3[5]);
		//array equals
		int[] arr4={5,6,7};
		int[] arr5={5,6,7};
		int[] arr6={5,5,7};
		System.out.println(arr4.length+" "+arr5.length);
		System.out.println(Arrays.equals(arr4,arr5));
		System.out.println(Arrays.equals(arr5,arr6));
		
	}
	
}