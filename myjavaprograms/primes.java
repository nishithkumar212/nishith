package myjavaprograms;
public class primes
{
public static void main(String[] args) 
{
  int	count=0;
  int num=0;
	for(int i=1;i<=1000;i++)
	{
     for(num=i;num>=1;num--)
     {
    	 if(i%num==0)
    	 {
    		 count=count+1;
    	 }
     }
    	 if(count==2)
    	 { 
      		     System.out.print(i+" ,");
    		  }	
    	 }
     }
}
