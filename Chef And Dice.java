
// Example Input
1
1
	
// Example Output
20
	
// Explanation
Example case 1: There is only one die. If Chef places it on the table with 1 pip facing down, the visible pips are 2, 3, 4, 5 and 6, and their sum is 20.
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    long n=sc.nextLong();
		    long sum=0;
		    sum=(n/4)*44;
		    int result=(int)(n%4);
		    if(n>=4){
		        if(result==0){
		            sum=sum+16;
		        }
		        if(result==1){
		           sum+=32; 
		        }
		        if(result==2){
		            sum+=44;
		        }
		        if(result==3){
		            sum+=55;
		        }
		        System.out.println(sum);
		    }
		    else{
		        int rem=0;
		        if(result==1){
		            rem=20;
		        }
		        if(result==2){
		            rem=36;
		        }
		        if(result==3){
		            rem=51;
		        }
		        System.out.println(rem);
		    }
		}
	}
}
