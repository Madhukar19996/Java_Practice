package day11;

public class StudentMain {

	public static void main(String[] args) 
	
	{
		//Student stu= new Student();
		
		//1).Assign data using object reference 
		
		/*stu.sid=101;
		stu.sname="Mohit";
		stu.grade='A';
		*/
		
		//2) Assign data by user defined method 
		
		
		/*stu.setStuData(101, "Madhukar", 'A');
		stu.printStuData();
		*/
		
		// Using Constructor 
		
		Student stu = new Student(101,"Tarun",'B');
		stu.printStuData();
		
		

	}

}
