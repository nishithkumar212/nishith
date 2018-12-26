package myjavaprograms;
import bridgeit.utility;
public class primefactors 
{
	public static void main(String[] args)
	{
		int counter=0;
		for(int i=1;i<=100;i++)
		{
			for(int j=i;j>=1;j--)
			{
				if(i%j==0)
				{
					counter=counter+1;
			}
			}
				if(counter==2)
				{
					System.out.print(i);
				}
		}
	}
}
