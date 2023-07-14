package BasicPrograms;

public class PAR {

	public static void main(String[] args) 
	{ 
		for (int i = 1; i <= 1000; i++)
		{
			int sum = 0;
			for (int j = 1; j < i; j++) 
			{
				if (i % j == 0)
				{
					sum = sum + j;
				}
			}
			if (sum == i)
			{
				int temp = i, temp3 = i, sum1 = 0, sum2 = 0, prev = 1;
				while (temp > 0) 
				{
					temp = temp / 10;
					sum1++;
				}
				while (temp3 > 0)
				{
					int rem = temp3 % 10;
					for (int k = 1; k <= sum1; k++)
					{
						prev = prev * rem;
					}
					sum2 = sum2 + prev;
					prev = 1;
					temp3 = temp3 / 10;
				}
				if (sum2 == i) 
				{
					int temp4 = i, rev = 0;
					while (temp4 > 0) 
					{
						int rem1 = temp4 % 10;
						rev = rev * 10 + rem1;
						temp4 = temp4 / 10;
					}
					if (rev == i)
					{
						System.out.println(i+"is palindrome,Armstrong,perfect");
					}
				}

			}

		}

	}

}
