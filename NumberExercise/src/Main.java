
public class Main {
		
	
	public static int number =  912344;
	public static int count = 0;
	static String numberAsString = String.valueOf(number);
	static String stringLength = "";
	String fullNumber = "";
	
		
	public static void main(String[] args) {
		printNumber();
		countNumber();
		threeNumbers(numberAsString);


	}
		
	public static void printNumber() {
		System.out.println(number);	
	}

	public static void countNumber() {
		while (number > 0) {
			
			count++;
			number = number/10;
			
		}
			System.out.println("Has " + count + " Numbers");
	
	}
	
	
	
	public static void threeNumbers(String numberAsString) {
		
		
		
		if(numberAsString.length() >  6) {
			stringLength = numberAsString.substring(0, 3);
			System.out.println(stringLength + " Million");
	

		}
		if(numberAsString.length() > 3 ) {
			stringLength = numberAsString.substring(0, 3);
			System.out.println(stringLength + " Thousand");

			}		
		
		if (numberAsString.length() > 0) {
			
			stringLength = numberAsString.substring(0, 3);	
			System.out.println(stringLength);


		
		}	
		

			
	} 
	
	
	
}


	


