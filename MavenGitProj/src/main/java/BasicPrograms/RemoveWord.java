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
		int count,count1=0,x=0, index=0;
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
//				if(count==ch1.length)
//				{
//					x++;
//				}
				if(count==ch1.length)
				{
					count1++;

					if(count1>1)
					{   
						index=i;	  
						for(int k=0;k<ch1.length;k++)
						{
							for(int l=index;l<ch.length-1;l++)
							{
								ch[l]=ch[l+1];

							}  
						}
					}
				}
			}
		}	  

		for(int i=0;i<ch.length-((count1*ch1.length)-(ch1.length));i++)
		{
			System.out.print(ch[i]);
		}
	}

}
