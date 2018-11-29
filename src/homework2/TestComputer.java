package homework2;

public class TestComputer {

	public static void main(String[] args) {
		
		Computer comp = new Computer();
		
		comp.brandName = "MacSierra";//initialization of the variables
		comp.displaySize = 15;
		comp.usMade = true;
		comp.computerInfo();
			System.out.println("computerInfo");
		
		comp.UserRating();
		System.out.println("user rating:  "+9);
		
		comp.userName = "Soheli"; //static variable
		
		
		comp.computerInfo();
		
		
		
		Computer comp1 = new Computer();
			comp1.brandName = "Samsung";
			comp1.displaySize = 15;
			comp1.usMade = false;
			comp1.computerInfo();
				System.out.println("computerInfo");//void method
				
			comp1.UserRating();
				System.out.println("user rating:  "+8);//return integar method 
			
				comp1.userName = "Nameera";//static variable
						
			comp.computerInfo();
			comp1.computerInfo();
			System.out.println(comp.userName + comp1.userName);
				
				

			
	}}
	       
			






					

		

	


		

	


