package Main;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] my_array1 = {1789,2035,1899,1456,2013,1458,2458,1254,1472,2365,1456,2265,1457,2456};
		
		int largest = my_array1[0];
		int secondLargest = my_array1[0];
		
		
		System.out.println("The given array is:");
		
		for (int i=0; i < my_array1.length; i++) {
			System.out.println(my_array1[i]+"\t");
			
			if(my_array1[i] > largest) {
				secondLargest = largest;
				largest = my_array1[i];
			}else if (my_array1[i] > secondLargest) {
				secondLargest = my_array1[i];
			}
		}
		System.out.println("\nSecond Largest Number is:" + secondLargest);

	}

}
