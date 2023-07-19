package BasicPrograms;
import java.util.*;
public class Split {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		int count=1;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				count++;
			}
		}
		String st[]=new String[count];
		String temp="";
		int inde=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				inde++;
				temp="";
			}
			else
			{
				temp=temp+ch[i];
				st[inde]=temp;
			}
		}
		for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i]+" ");
		}


	}

}
