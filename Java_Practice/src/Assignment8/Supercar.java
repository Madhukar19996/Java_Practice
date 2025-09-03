package Assignment8;

public class Supercar {
	
	 private String ownerName;
	    private double price;
	    private String colour;
	    private String brand;

	    // Step 1: Create a private static instance (only one object)
	    private static Supercar instance;

	    // Step 2: Make constructor private so no one else can create objects
	    private Supercar() {}

	    // Step 3: Provide a public method to get the single instance
	    public static Supercar getInstance() {
	        if (instance == null) {
	            instance = new Supercar();  // object created only once
	        }
	        return instance;
	    }

	    // Getters and Setters
	    public String getOwnerName() {
	        return ownerName;
	    }

	    public void setOwnerName(String ownerName) {
	        this.ownerName = ownerName;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public String getColour() {
	        return colour;
	    }

	    public void setColour(String colour) {
	        this.colour = colour;
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public void setBrand(String brand) {
	        this.brand = brand;
	    }

	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		
		
		 Supercar car = Supercar.getInstance();

	        // Set details
	        car.setOwnerName("Elon Musk");
	        car.setPrice(1000000);
	        car.setColour("Black");
	        car.setBrand("Tesla");

	        // Print details
	        System.out.println("Owner: " + car.getOwnerName());
	        System.out.println("Price: " + car.getPrice());
	        System.out.println("Colour: " + car.getColour());
	        System.out.println("Brand: " + car.getBrand());

	        // Trying to create another car
	        Supercar anotherCar = Supercar.getInstance();
	        System.out.println("Both objects are same? " + (car == anotherCar));

	}
	
	
	
	

}
