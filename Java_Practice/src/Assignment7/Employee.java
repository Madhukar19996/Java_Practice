package Assignment7;

public class Employee {
	
	int empid;
	String Name;
	int Salary;
	
	void setvalues(int id, String name, int salary)
	{
		empid=id;
		Name=name;
		Salary=salary;
	}
	
	void Getvalues()
	{
		System.out.println("EmpId is :"+empid+" "+"Name is :"+Name+" "+"Salary is :"+Salary);
	}
	

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.setvalues(2252211, "Madhukar Pandey", 500000);
		e2.setvalues(2281231, "Amit", 450000);
		
		e1.Getvalues();
		e2.Getvalues();

	}

}
