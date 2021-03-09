import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++){
		    String str1=sc.next();
		    String str2=sc.next();
		    int m=Math.min(str1.length(),str2.length());
		    int min=0,max=0;
		    for(int i=0;i<m;i++){
		        if(str1.charAt(i)!=str2.charAt(i)&&str1.charAt(i)!='?'&&str2.charAt(i)!='?')
		                min++;
		        if(str1.charAt(i)=='?'||str2.charAt(i)=='?'||str1.charAt(i)!=str2.charAt(i))
		                max++;
		    }
		    System.out.println(min+" "+max);
		}
	}
}
