package BasicPrograms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("given number is even number");
			
		}
		else
		{
			System.out.println("given number is odd number");
		}
		

	}

}
