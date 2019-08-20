package Main;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Muneef";
		int length = name.length();
		
			
		if(name.length()== 5) {
			System.out.println("The string is not empty and length is:" + name.length());
			
		}else if(name.length()<5) {
			System.out.println("-----");
			
		}else if ( name.length()>5) {
			System.out.println("The String is empty and length is:" + name.length());
			
		}
		
		
		
		

	}

}
