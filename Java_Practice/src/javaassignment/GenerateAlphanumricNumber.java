package javaassignment;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateAlphanumricNumber {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("deprecation") 
		   String randomString()
		{
			String generatedString = RandomStringUtils.randomAlphabetic(6);
			return generatedString;
		}
		
		@SuppressWarnings("deprecation")
		public String randomNumber()
		{
			String generatednumber = RandomStringUtils.randomNumeric(10);
			return generatednumber;
		}
		
		@SuppressWarnings("deprecation")
		public String randomAlphanumeric()
		{
			String generatedString = RandomStringUtils.randomAlphabetic(4);
			String generatednumber = RandomStringUtils.randomNumeric(3);
			return (generatedString+generatednumber+"@");
		
		

	}

}
