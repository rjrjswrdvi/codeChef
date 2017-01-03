/*https://www.codechef.com/ZCOPRAC/problems/ZCO14003/*/
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		long t = scan.nextLong();
		List<Long> list = new ArrayList<Long>();
		for(int i=0;i<t;i++){
		    list.add(scan.nextLong());
		}
		Collections.sort(list);
		long max = Long.MIN_VALUE;
		long val;
		int size = list.size();
		for(int i=0;i<t;i++){
		    val = list.get(i);
		    val = val * (size-i);
		    if(max<val)max= val;
		}
		System.out.println(max);
	}
}
