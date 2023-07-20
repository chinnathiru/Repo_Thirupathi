package BasicPrograms;
import java.util.*;
public class RemoveWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		System.out.println("enter remove word");
		String str1=sc.next();
		char ch1[]=str1.toCharArray();
		int index=0;
		for(int i=0;i<ch.length;i++)
		{
			int count=0;
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
				index=i+j;
			}
			
			if(count==ch1.length)
			{
				
				for(int k=0;k<ch.length;k++)
				{
					if(k<i||k>index)
					{
						System.out.print(ch[k]);
					}
					
					}
				}
			}

	}

}
