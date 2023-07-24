package BasicPrograms;
import java.util.*;
public class BestMarks
{
	private Scanner scan;
	private int ScanStudentMarks(String type)
	{
		
		System.out.println("enter "+type);
		int marks=scan.nextInt();
		return marks;
		
		
	}
	private String didUAttemptedImprovmentExamMArks()
	{
		System.out.println("did U Attempted Improvment Exam MArks ");
		String answer=scan.next();
		return answer;
	}
	private boolean IsIMPExamMarksIsBest(int impmarks, int mainmarks)
	{
		return impmarks>mainmarks;
		
	}
	private void displayMarks(String type,int marks)
	{
		System.out.println(type+":"+marks);
	}
	private boolean isIMprovementAttempted(String answer)
	{
		return answer.equals("yes");
		
	}
	public void displayBestMarks()
	{
		scan =new Scanner(System.in);
		int mainmarks=this.ScanStudentMarks("main exam Marks");
		String answer=this.didUAttemptedImprovmentExamMArks();
		if(this.isIMprovementAttempted(answer))
		{
		int impmarks=this.ScanStudentMarks("Improvment exam marks:");
		if(this.IsIMPExamMarksIsBest(impmarks, mainmarks))
		{
			this.displayMarks("final marks", impmarks);
		}
		else
		{
			this.displayMarks("fianal marks", mainmarks);
		}
		}
		else
		{
		this.displayMarks("final marks", mainmarks);	
		}
			
		}
	public static void main(String[] args)
	{
		BestMarks find=new BestMarks();
		find.displayBestMarks();
		
	}

}
