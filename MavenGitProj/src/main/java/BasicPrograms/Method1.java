package BasicPrograms;

import java.util.Scanner;

public class Method1
{
	static Scanner sc;
	public static void m1()
	{
		sc=new Scanner(System.in);
		System.out.println("enter a, b values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("the addition value of c="+c);
		
		
	}
	public int m(int a1, int b1)
	{
		
		int c1=a1-b1;
//		System.out.println("the substraction value="+c1);
		return c1;
		
		
	}

	public int m3(int a3, int b3)
	{
		int c3=a3/b3;
		return c3;

	public int m2(int a2,int b2)
	{
		int c2=a2*b2;
		return c2;

	}

	public static void main(String[] args) 

	{
		Method1 n=new Method1();
		n.m1();
	
		int c=n.m(15, 30);
		System.out.println("the substraction value="+c);

       int r1= n.m3(15, 5);

		int r=n.m2(25, 5);
		System.out.println("the mutliplication of value="+r);
		

	}

}
