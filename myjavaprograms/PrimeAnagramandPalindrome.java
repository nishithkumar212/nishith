package algorithms;
import java.util.Arrays;
public class PrimeAnagramandPalindrome 
{
public static void main(String[] args)
{
	String primes="";
	String sprimes="";
	for(int i=1;i<=100;i++)
	{
		int count=0;
		for(int num=i;num>=1;num--)
		{
			if(i%num==0)
			{
				count=count+1;
			}
		}
		if(count==2)
		{
			primes=primes+i+",";	
		}
	}
	System.out.println(primes);
char[] a=primes.toCharArray();
for(int j=0;j<a.length-1;j++)
{
	for(int k=j+1;k<a.length-2;k++)
	{
		int rev=0;
		while(a[k]>0)
		{
			int rem=k%10;
			 rev=rev*10+rem;
			 k=k/10;
		}
		if(a[j]==rev)
{
	System.out.println("the anagrams of primes are:"+rev);
}
	}	
}
}
}

