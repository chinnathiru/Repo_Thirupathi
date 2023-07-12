package BasicPrograms;

import java.util.Scanner;

public class TwoNumbersEqualOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a, b values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a==b)
		{
			System.out.println("twovaraible numbers are equal");
		}
		else
		{
			System.out.println("twovaraible numbers are not equal");
		}
		
	}

}
