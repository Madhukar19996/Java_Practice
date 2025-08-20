package Assignment7;

public class Contact {
	
	private int id;
	private String firstname, lastname,email;
	private int mobile_no;
	
	
	

	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getFirstname() {
		return firstname;
	}




	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}




	public String getLastname() {
		return lastname;
	}




	public void setLastname(String lastname) {
		this.lastname = lastname;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public double getMobile_no() {
		return mobile_no;
	}




	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}
	
	




	public static void main(String[] args) {
		
		Contact c1=new Contact();
		c1.setId(2243422);
		c1.setFirstname("Anita");
		c1.setLastname("Sharama");
		c1.setMobile_no(998876754);
		c1.setEmail("Anita2001@gmail.com");
	
		System.out.println(c1.getId());
		System.out.println(c1.getFirstname());
		
		System.out.println(c1.getLastname());
		System.out.println(c1.getMobile_no());
		System.out.println(c1.getEmail());

	}

}
