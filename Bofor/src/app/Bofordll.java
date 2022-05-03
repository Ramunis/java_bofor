package app;

public class Bofordll {
	
	protected String key;
	protected String m;
	protected int k;
	
	public Bofordll(String key,String m)
	{
		this.key = key;
		this.m = m;
	}
	
	public void setkey(String key)
	{
		this.key = key;
	}
	
	public String getkey()
	{
		return this.key;
	}
	
	public void setm(String m)
	{
		this.m = m;
	}
	
	public String getm()
	{
		return this.m;
	}
	
	
	public static int tokey(String key)
	{
		int newmkey = 0;
		char[] k = key.toCharArray();
		for (int i = 0; i < key.length(); i++) 
		{
		  newmkey +=  ((int) key.charAt(i));
		}	
		return newmkey;
	}
	
	public static String Encrypt(String m,int k)
	{
		String out="";
		
		for (int i=0;i<m.length();i++)
		{
			char c=m.charAt(i);
			c += (char)( k %26);
			
			out +=c;
		}	
		return out;
	}
	
	public static String Decrypt(String m,int k)
	{
		String out="";
		
		for (int i=0;i<m.length();i++)
		{
			char c=m.charAt(i);
			c -= (char)( k %26);
			
			out +=c;
		}	
		return out;
	}

}
