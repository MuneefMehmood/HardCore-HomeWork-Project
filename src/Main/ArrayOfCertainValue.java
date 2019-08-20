package Main;

public class ArrayOfCertainValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] my_array1 = {1789,2035,1899,1456,2013,1458,2458,1254,1472,2365,1456,2265,1457,2456};
		
		for(int i=0; i < my_array1.length; i++) {
			
			if(my_array1[i] == 2013) {
				System.out.println("This Array has the Value \'2013\'");
			}if (my_array1[i] == 2019) {
				System.out.println("This Array has the Value \'2019\'");
			}
		}

	}

}
