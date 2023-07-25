package BasicPrograms;
import java.util.List;
import java.util.ArrayList;
public class Assending_Order_List {

	public static void main(String[] args) {

		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(15);
		l.add(5);
		l.add(3);
		for(int i=0;i<l.size();i++)	
		{
			for(int j=0;j<l.size();j++)
			{
				if(l.get(i)<l.get(j))
				{
					int min =l.get(i);
					l.set(i, l.get(j));
					l.set(j, min);
					 

				}
			}
		}
		for(int i=0;i<l.size();i++)	
		{
			System.out.println(l.get(i));
		}

	}

}
