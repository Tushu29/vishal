
public class Reverse_String 
{

	public static void main(String[] args) {
		
		String s="SURAJ";
	
		
		for(int k=0;k<1;k++) 
		{
			
			for(int i=s.length()-1;i>=0;i--)
			{
			 if(i<2)
				{
					System.out.print(s.charAt(i));
				}
			
			 	}
			for(int j=2;j<=s.length()-1;j++)
			{
				System.out.print(s.charAt(j));
			}
			
			
			
			}
		}
	}
	
	
	
	

