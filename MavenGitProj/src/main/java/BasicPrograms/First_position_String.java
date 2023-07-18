package BasicPrograms;

import java.util.Scanner;

public class First_position_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		System.out.println("enter substring");
        String str1=sc.next();
        char ch1[]=str1.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++)
        {
        	if(ch[i]==' ')
			{
				break;
			}
			else
			{
				count++;
			}
        }
        int count1=0;
        for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]==ch[i])
			{
				count1++;
			}
		}
        if(count1==str1.length())
        {
        	System.out.println("given string is fist position ");
        }
        else
        {
        	System.out.println("given string is not  fist position ");
        }
	}

}
