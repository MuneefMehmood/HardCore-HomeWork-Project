package Main;

public class DuplicateArrayStringValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String[] my_array = {"bcd","abd","jude","bcd","oiu","gzw","oiu"};
		 
		 for (int i=0; i < my_array.length-1; i++) {
		 for (int j = i + 1; j < my_array.length; j++) {
			 
			 if ((my_array[i] == my_array[j])) {
				 System.out.println("Duplicate Value Of Array:" + my_array[j]);
			 }
		 }
		 }
	}

}
