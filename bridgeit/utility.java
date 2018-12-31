package bridgeit;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;import org.omg.Messaging.SyncScopeHelper;

public class utility 
	{
	static Scanner sc=new Scanner(System.in);
	public static int getint()
	{
		 return sc.nextInt();
	}
	public static String getstring()
	{
		 return sc.next();
	}
	public static  String getstringwords()
	{
		 return sc.nextLine();
	}
	public static  float getfloat()
	{
		 return sc.nextLong();
	}
	public static double getdouble()
	{
		return sc.nextDouble();
	}
	public static long start()
	{
		return System.currentTimeMillis();
	}
	public  static long stop()
	{
		return System.currentTimeMillis();
	}
public static int  binarysearch(int[] arr,int key)
{
	int start=0;
	int end=arr.length-1;
	int mid=start+(end-start)/2;
	while(start<=end)
	{
	if(key==arr[mid])
	{
  return mid;
	}
	else if(key<arr[mid])
	{
		end=mid--;
	}
	else if(key>arr[mid])
	{
		start=mid++;
	}
}
	return -1;
}
public  static int binaryserchstring(String[] arr,String x)
{
	 int l = 0, r = arr.length - 1; 
	    while (l <= r) { 
	        int m = l + (r - l) / 2; 
	        int res = x.compareTo(arr[m]); 
	        if (res == 0) 
	        {
	            return m;
	        }
	        if (res > 0) 
	        {
	            l = m + 1;
	        }
	        else
	        {
	            r = m - 1; 
	    }
	    }
		return -1;
	} 
public static void bubblesortinteger(int[] arr)
{
	int n=arr.length;
	for(int i=0;i<n-1;i++)
	{
		for(int j=0;j<n-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}
		}
}
	for(int k=0;k<=arr.length-1;k++)
	{
		System.out.print(arr[k]+" ");
	}
}
	public  static void bubblesortstring(String[] srr)
	{
		int len=srr.length;
		for(int i=0;i<len-1;i++)
		{
			for(int j=0;j<len-1;j++)
			{
		        int res=srr[j].compareTo(srr[j+1]);
		        if(res>0)
		        {
		        	String temp=srr[j];
		        	srr[j]=srr[j+1];
		        	srr[j+1]=temp;
		        }
			}
		}
		for(int k=0;k<=srr.length-1;k++)
		{
			System.out.print(srr[k]+" ");
		}
		}
	public static void insertionsortinteger(int[] arr)
	{

		int len=arr.length;
		for(int i=1;i<len;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key)
			{
			 arr[j+1]=arr[j];
			 j=j-1;
			}
			arr[j+1]=key;
		}
		for(int k=0;k<=arr.length-1;k++)
		{
			System.out.print(arr[k]+"  ");
			System.out.println();
		}
	}
	public static void insertionsortString(String[] arr)
	{
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			String key=arr[1];
			int j=i-1;
			while(j>=0)
			{
				if(key.compareTo(arr[j])<0);
				{
				}
				arr[j+1]=arr[j];
				j=j-1;
			}
				arr[j+1]=key;
			    }
		for(int k=0;k<=arr.length-1;k++)
		{
			System.out.print(arr[k]);
		}
	}
	public static  void readstring(String path,String divide) {
		String line = null;
		String[] words = null;
		
		try {
		InputStream is =new FileInputStream(path);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		while((line = br.readLine())!=null) 
		{
			words = line.split(divide);
		}
	 for(int i=0;i<=words.length-1;i++)
	 {
		 System.out.print(words[i]+"  ");
	 }
	 System.out.println();
		System.out.println("enter the string");
		String k=utility.getstring();
		int result=utility.binaryserchstring(words, k);
		if (result == -1) 
		{
			System.out.println("Element not present"); 
		}
		else
		{
		    System.out.println("Element found at "
		                      + "index " + result);
			}
		}
		catch(Exception e)
		{			
		}
	}
	public static void readlist(String path,String divide) throws IOException
	{
		ArrayList<String> al=new ArrayList<>();
		String line;
		String[] words = null;
		FileInputStream fis=new FileInputStream(path);
		InputStreamReader is=new InputStreamReader(fis);
		BufferedReader br=new BufferedReader(is);
	   while((line=br.readLine())!=null)
	   {
		   words=line.split(divide);
	   }
		for(int i=0;i<words.length-1;i++)
		{
			al.add(words[i]);
		}
		String sr1[]= al.toArray(new String[al.size()]);
	int[] brr=new int[sr1.length-1];
	for(int i=0;i<brr.length-1;i++)
	{
		brr[i] = Integer.parseInt(sr1[i]);
	}
	utility.bubblesortinteger(brr);

	}
	
	
	
	}

	
	

