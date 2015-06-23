
public class JavaExamples {

	static final String successful_grading = "Student Graded: ";
	
	public static void main(String[] args) {
		
		float grade = 77;
		boolean enrolled = true;
		boolean cheated = false;
		String gradingResult;
		
		if (enrolled) 
		{
			if(cheated)
			{
				gradingResult = "Student Cheated: Disqualified";
			}
			else 
			{
				if(grade < 0 || grade > 100)
					gradingResult = "Grading Failed: Invalid Grade";
				else if(grade >= 90)
					gradingResult = successful_grading + "A";
				else if(grade > 80)
					gradingResult = successful_grading + "B";
				else if(grade > 70)
					gradingResult = successful_grading + "C";
				else if(grade > 60)
					gradingResult = successful_grading + "D";
				else
					gradingResult = successful_grading + "Failed";
			}
		}
		else
		{
			gradingResult = "Student Not Enrolled: Not Graded";
		}
		
		System.out.println(gradingResult);
	}

}
