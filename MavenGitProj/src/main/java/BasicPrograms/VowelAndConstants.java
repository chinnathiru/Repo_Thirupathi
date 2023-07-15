package BasicPrograms;
import java.util.*;
public class VowelAndConstants {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		int v=0,c=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				System.out.print(ch[i]);
				v=v+1;
			}
		}
		System.out.println();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='a'&&ch[i]!='e'&&ch[i]!='i'&&ch[i]!='o'&&ch[i]!='u'&&ch[i]!=' ')
			{
				System.out.print(ch[i]);
				c=c+1;
			}
		}
		System.out.println();
		System.out.println("vowels are"+v);
		System.out.println("constanse are"+(c));
	}

}
