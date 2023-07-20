package BasicPrograms;
import java.util.*;
public class DuplicateValue_List {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements size");
		int s=sc.nextInt();
		for ( int i=0;i<s;i++)
		{
			System.out.println("enter the value in the postion"+i);
		   l.add(sc.nextInt());
		}
		int count=0;
		for (int i=0;i<l.size();i++)
		{
			for(int j=i;j<l.size();j++)
			{
				if(l.get(i)==l.get(j))
				{
					count++;
					for(int k=i-1;k>=0;k--)
					{
						if(l.get(k)==l.get(i))
						{
							count--;
						}
					}

				}
			}

			if(count>0)
			{
				System.out.println(l.get(i));
			}
			count=0;
		}


	}

}
