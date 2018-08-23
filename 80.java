/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int d[]=new int[6];int i=0;
		while(n!=0)
		{
			d[i++]=n%10;
			n=n/10;
		}
		for(int j=5;j>=0;j--)
		{
			if(d[j]%2==1)
			{
				System.out.print(d[j]+" ");
			}
		}
	}
}
