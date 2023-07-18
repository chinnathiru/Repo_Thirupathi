package BasicPrograms;
import java.util.*;
public class ElementHowManyTimesRepated {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
	     String str=sc.nextLine();
	     int count=1,count1=1;
	     char[] ch=str.toCharArray();
	     for(int i=0;i<ch.length;i++ )
	     {
	    	 count=1;
	    	 for(int j=i+1;j<ch.length;j++ )
	    	 {
	    	 if((ch[i]==ch[j]))
	    	 {
	    		 count++;
	    		 ch[j]=' ';
	    	 }
	    	 else
	    	 {
	    		 count1=1;
	    	 }
	    	
	     }
	     if(count>1&&ch[i]!=' ')
    	 {
    		 System.out.println(ch[i]+" :"+count);
    	 }
	     else if(count1>=1&&ch[i]!=' ')
	     {
	     System.out.println(ch[i]+" :"+count1);
	     }
	     

	}
	}

}
