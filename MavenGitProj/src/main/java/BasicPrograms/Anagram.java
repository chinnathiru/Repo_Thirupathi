package BasicPrograms;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string1");
		String str1=sc.nextLine();
		char ch[]=str1.toCharArray();
		System.out.println("enter string2");
		String str2=sc.nextLine();
		char ch1[]=str2.toCharArray();
		int count=0;
		if(ch.length==ch1.length)
		{

			for(int i=0;i<ch.length;i++)
			{
				char cr=ch[i];
				int c=0,c1=0;
				for(int j=0;j<ch1.length;j++)
				{

					if(ch[j]==cr)
					{
						c=c+1;
					}

					if(cr==ch1[j])
					{   
						c1=c1+1;
					}

				}
				if(c==c1)
				{
					count=count+1;	
				}
			}
			if(count==ch.length)

			{
				System.out.println("given string is anagram");	
			}
			else
			{
				System.out.println("given string is not anagram ");
			}

		}
		else
		{
			System.out.println("given string is not equal ");
			System.out.println(".................enter correctly......");


		}

	}

}
