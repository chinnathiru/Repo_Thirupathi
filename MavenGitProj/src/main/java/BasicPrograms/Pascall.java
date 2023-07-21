package BasicPrograms;

public class Pascall {

	public static void main(String[] args) {
		int n=5,resu=0;
		for(int i=0                                                                                                                                                                                        ;i<=n;i++)
		{
			for(int sp=1;sp<=n-i;sp++)
			{
				System.out.print(" ");
			}
			
			for( int j=0;j<=i;j++)
			{ 
			
			int rfact=1;
				for(int k=1;k<=i;k++)
				{
					rfact=rfact*k;
					//System.out.print(rfact+" ");	
				}
				int ijfact=1;
				for(int l=1;l<=i-j;l++)
				{
					ijfact=ijfact*l;
					
				}
				int jfact=1;
				for(int m=1;m<=j;m++) {
					jfact=jfact*m;
				}
				resu=rfact/(ijfact*jfact);
				System.out.print(resu+" ");
			}
							
			
			System.out.println();
		}

	}

}
