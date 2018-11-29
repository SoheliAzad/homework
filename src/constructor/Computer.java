package constructor;

	public class Computer {//opening of curly brace
		
		public String brandName; //variables declared, class variables
		int displaySize;
		boolean usMade;
		int rating;
			
		public Computer() {} //default constructor
		
		
		public Computer(String brandName) { //opening of constructor 2
			this.brandName = brandName;
			System.out.println(brandName);}//closing of constructor 2
		
		
		public Computer(String brandName, int displaySize) {//opening of constructor 3
			this.brandName = brandName;
			this.displaySize = displaySize;
			System.out.println(brandName +"  "+displaySize); } //closing of constructor 3
			
			

}
