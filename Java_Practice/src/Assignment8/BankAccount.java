package Assignment8;

public class BankAccount {
	
	String  accNum;
	String cusName;
	double cusBal;
	static int rateOfInterest;
	
	 void setCustomerDetails(String  t_accNum,String t_cusName,double t_cusBal) {
		 
		 accNum= t_accNum;
		 cusName=t_cusName;
		 cusBal= t_cusBal;
		 
	
	 }
	 
	void getCustomerDetails() {
		
		System.out.println(accNum);
		System.out.println(cusName);
		System.out.println(cusBal);
	    System.out.println("-------------------------------------------------");
		
	}
	 
	static void setROI(int t_rateOfInterest) {
		
		rateOfInterest=t_rateOfInterest;
		
	}
	
	void calculateSI(int time) {
		
		double SimpleInterest= (cusBal*rateOfInterest*time)/100;
		
		System.out.println("Your Simple Interest in "+time+" year is "+SimpleInterest);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		BankAccount Acc1=new BankAccount();
		
		Acc1.setCustomerDetails("887675543", "Madhukar Pandey", 500000);
		
		Acc1.getCustomerDetails();
		
		BankAccount.setROI(5);
		
		Acc1.calculateSI(5);
		
	    BankAccount Acc2=new BankAccount();
		
		Acc2.setCustomerDetails("8876756753", "Piyush Pandey", 5000);
		
		Acc2.getCustomerDetails();
		
		Acc2.calculateSI(5);
		

	}

}
