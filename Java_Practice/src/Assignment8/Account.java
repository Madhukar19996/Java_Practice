package Assignment8;

public class Account {

	int accountNumber ;
	String customerName;
	float Balance;
	static int rateOfInterest;
	int simpleInterest;


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public float getBalance() {
		return Balance;
	}


	public void setBalance(float balance) {
		Balance = balance;
	}



	public static void setRateOfInterest(int rateOfInterest) {
		Account.rateOfInterest = rateOfInterest;
	}


	public void calculateSimpleInterest(int t) {

		simpleInterest= (int) (Balance*rateOfInterest*t/100);
		
		System.out.println("Your Simple Interest is :"+simpleInterest);

	}




	public static void main(String[] args) {
		
		Account a1=new Account();
		a1.setAccountNumber(224854342);
		a1.setCustomerName("Gaurav Soni");
		a1.setBalance(500000);
		setRateOfInterest(5);
		System.out.println(a1.getAccountNumber());
		System.out.println(a1.getCustomerName());
		a1.calculateSimpleInterest(5);
		

	}

}
