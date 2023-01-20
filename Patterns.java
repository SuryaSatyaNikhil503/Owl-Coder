public class Main
{
	public static void main(String[] args) 
	{
		//pattern3(10);
		pattern4(5);
	}
	static void pattern3(int n)
	{
	    for(int i=1 ; i<=n ; i++)
	    {
	        for(int j=1 ; j<=n-i+1 ; j++)
	        {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
	static void pattern4(int n)
	{
	    for(int i=0 ; i< 2*n ; i++)
	    {
	        int con = i > n ? 2*n-i : i;
	        for(int j=0 ; j<con ; j++)
	        {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
}
