/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int sum=0;
			for(int i=0;i<n;i++)
			{
				int x=sc.nextInt();
				int y=sc.nextInt();
				int z=sc.nextInt();
				sum+=(x*z);
			}
			System.out.println(sum);
		}
	}
}
