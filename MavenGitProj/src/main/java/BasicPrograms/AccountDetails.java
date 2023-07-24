package BasicPrograms;

public class AccountDetails 
{
	//private int a;
	private long AccoNo=1254683;
	private String Name="thiru";
	private String email="thiru@123";
	private String password="thiru123";

	public long getAccoNo()
	{
		System.out.println(AccoNo);
		return AccoNo;
		
		

	}
	public void setAcoNo()
	{
		AccoNo=AccoNo;
	}	
	public String getName()
	{  
		System.out.println(Name);
		return Name;

	}
   public void setName()
   {
    	Name=Name;
    	
    }
    public String getemail()
    
    {
    	System.out.println(email);
    	return email;
    }
    public void setemail()
    {
    	email=email;
    }
    public String getpassword()
    
    {
    	System.out.println(password);
    	return password;
    	
    }
    public void setpassword()
    {
    	password=password;
    }
    //with Scanner 
    public static void main(String[] args)
	{
    	AccountDetails n=new AccountDetails();
		
//         n.setAcoNo();
//         n.setName();
//         n.setemail();
//         n.getpassword();
		System.out.println(n.getAccoNo()+"\n"+n.getName()+"\n"+n.getemail()+"\n"+n.getpassword());
				
	}
  
    

}
