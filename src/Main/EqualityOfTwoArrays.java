package Main;

import java.util.Arrays;

public class EqualityOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray1 = {1,3,5,7};
		int[] intArray2 = {1,3,5,7,8};
		int[] intArray3 = {1,3,5,7,8};
		
		System.out.println(Arrays.equals(intArray1, intArray2));
		System.out.println(Arrays.equals(intArray2, intArray3));

	}

}
