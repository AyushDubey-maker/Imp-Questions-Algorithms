import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    // Was getting error while taking length greater than 4.
		    String str1[]=new String[4];
		    String str2[]=new String[4];
		    int result=0;
		    for(int i=0;i<4;i++){
		        str1[i]=sc.next();
		    }
		      for(int i=0;i<4;i++){
		        str2[i]=sc.next();
		    }
		     for(int i=0;i<4;i++)
		     {
		          for(int j=0;j<4;j++)
		          {
		              if(str1[i].equals(str2[j])){
		                  result++;
		                  break;
		              }
		          }
		     }
		     if(result>=2){
		         System.out.println("similar");
		     }else{
		          System.out.println("dissimilar");
		     }
		}
	}
}
