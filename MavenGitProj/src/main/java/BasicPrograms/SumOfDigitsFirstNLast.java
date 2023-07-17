package BasicPrograms;
import java.util.*;
public class SumOfDigitsFirstNLast {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter n number");
		int n=scan.nextInt();
		int rem=n%10;
		int temp=n,sum=0;
		while(temp>0) 
		{
			sum=temp;
			temp=temp/10;
			
		}
		System.out.println("sum="+(sum+rem));
		System.out.println("welcome to ZTOH......");

	}

}
