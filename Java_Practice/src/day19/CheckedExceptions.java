package day19;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedExceptions {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Program is Started...");
		System.out.println("Program is Progress...");
		
		/*try
		{
		FileInputStream file =new FileInputStream("C:\\Users\\Madhukar Pandey\\git\\repository\\Java_Practice\\src\\day19\\file.txt");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		*/
		
		FileInputStream file =new FileInputStream("C:\\Users\\Madhukar Pandey\\git\\repository\\Java_Practice\\src\\day19\\file.txt");

		System.out.println(file.read());
		System.out.println("Program is Completed...");



	}

}
