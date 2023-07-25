package BasicPrograms;
import java.util.*;
public class Trim {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
	    String str=sc.nextLine();
	    char ch[]=str.toCharArray();
	    String str1="";
	    for(int i=0;i<ch.length;i++)
	    {
	    	if(ch[i]!=' ')
	    	{
	    		for(int j=i;j<ch.length;j++)
	    		{
	    			str1=str1+ch[j];
	    		}
	    		break;
	    	}
	    }
	   // System.out.println(str1);
	    char ch1[]=str1.toCharArray();
	    String str2="";
	    for(int i=ch1.length-1;i>=0;i--)
	    {
	    	 if(ch1[i]!=' ')
	    	 {
	    		 for(int j=i;j>=0;j--)
	    		 {
	    			 str2=ch1[j]+str2;
	    			 //System.out.println(str2);
	    		 }
	    		break; 
	    	 }
	    	        
	    }
	    System.out.print(str2);

	}

}
