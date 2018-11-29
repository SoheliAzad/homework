package homework2;

public class Computer {//opening of curly brace
	
	public String brandName; //variables declared
	int displaySize;
	boolean usMade;
	int rating;
	static String userName;
	

	
	public void computerInfo() {//void method
		System.out.println("Computer info: "+brandName+" "+displaySize+" "+usMade);}

	
	public int UserRating() {// return integar type method
		return rating; }
	

	
	public Computer() {} //default constructor
	
	
	public Computer(String brandName) { //opening of constructor 2
		this.brandName = brandName;
		System.out.println(brandName);}//closing of constructor 2
	
	
	public Computer(String brandName, int displaySize) {//opening of constructor 3
		this.brandName = brandName;
		this.displaySize = displaySize;
		System.out.println(brandName +"  "+displaySize); } //closing of constructor 3
		
	
	
	
	
	public static void userName() {// static method
		System.out.println("userName");
	}//closing of curly brace
	
	
	
	

	
	
		

	}


