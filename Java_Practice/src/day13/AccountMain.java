package day13;

public class AccountMain {

	public static void main(String[] args) {
		Account acc= new Account();
		acc.setAccno(10023256);
		acc.setName("Madhukar");
		acc.setAmount(55555.1234);
		
		System.out.println(acc.getAccno());
		System.out.println(acc.getName());
		System.out.println(acc.getAmount());
	}

}
