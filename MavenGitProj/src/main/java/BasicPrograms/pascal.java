package BasicPrograms;

import java.util.Scanner;

public class pascal
{
	static Scanner sc;
	public static void add()
	{
		sc=new Scanner(System.in);
		System.out.println("enter a, b values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("the addition of c value ="+c);
		
	
	}

	public static void main(String[] args) {
		pascal.add();
	}

			
		
		
	

	

}
