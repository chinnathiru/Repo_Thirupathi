package BasicPrograms;

import java.util.Scanner;

public class CharcterCount {

	public static void main(String[] args) {
		Scanner dc=new Scanner(System.in);
		System.out.println("enter string");
		String str=dc.nextLine();
		char  ch[]=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				count++;
			}
			
		}
		System.out.println(ch.length-count);

	}

}
