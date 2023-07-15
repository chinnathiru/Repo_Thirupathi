package BasicPrograms;
import java.util.*;
public class VowelOrNot {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter word or name ");
	    //String c=scan.next();
		char c=scan.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			System.out.println("vowel");
		}
		else 
		{
			System.out.println("not vowel");
		}
		
	
	}

}
