package InterviewJavaProgram;

public class CountStringOccurance {
	
	public  static int CharOccuranceCount(String Word, char character) {
		
		 int count =0;
		
		for(int i=0;i<Word.length();i++)
		{
			if(Word.charAt(i)==character)
			{
				count++;
			}
		}
		return count;
		
		
		
		
		
	}

	public static void main(String[] args) {
		
		int count =CharOccuranceCount("Madhukar",'a');
		
		System.out.println("Character count Occurance is: "+count);

	}

	

}
