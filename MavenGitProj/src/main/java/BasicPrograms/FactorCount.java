package BasicPrograms;
import java.util.*;

public class FactorCount {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt(),count=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
				
			}
			
		}
		System.out.println("the factors are="+count);
	}

}

	


