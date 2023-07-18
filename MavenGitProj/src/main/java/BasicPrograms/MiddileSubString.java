package BasicPrograms;

import java.util.Scanner;

public class MiddileSubString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		System.out.println("enter substring");
		String str1=sc.next();
		char ch1[]=str1.toCharArray();
		int count;
		for(int i=0;i<ch.length;i++)
		{
			count=0;
			for(int j=0;j<ch1.length;j++)
			{
				if(ch[i+j]==ch1[j])
				{
					count++;
				}
				else
				{
					break;
				}
			}
			if(count==ch1.length)
			{
				System.out.println("given string is middle substring");
				break;
			}
		}
		
		

	}

}
