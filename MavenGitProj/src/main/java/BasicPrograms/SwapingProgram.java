package BasicPrograms;

public class SwapingProgram {

	public static void main(String[] args) {
		int a=10;
		int b=15;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping numner a="+a+"\n b="+b);
		//using third varaible
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("swapping number using thrid varilbe="+a+"\n="+b);

	}

}
